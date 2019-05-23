package com.triplepi.projectilemes.domain.interactors

import android.os.Build
import android.support.annotation.RequiresApi
import com.triplepi.projectilemes.App
import com.triplepi.projectilemes.data.network.dto.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

class LoadScheduleUseCase : UseCase<List<ScheduleItemDTO>>() {

    private val api = App.INSTANCE.api

    override val dispatcher: CoroutineDispatcher
        get() = Dispatchers.IO

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun run(): List<ScheduleItemDTO> {
        val formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:SSZ")
        val begin = formatter.print(formatter.parseDateTime("2019-01-30T09:52:00Z"))
        val end = formatter.print(formatter.parseDateTime("2019-01-30T09:52:00Z").plusHours(8))
        return api.getSchedule(minTs = null, begin = begin, end = end).execute().body().orEmpty()
            .filter { x -> x.WorkCenter?.Id == App.INSTANCE.workCenterID.toLong() }
    }


}