package com.elsunhoty.remote.api

import com.elsunhoty.remote.models.ChapterRemote
import com.elsunhoty.remote.models.ResponseRemote
import retrofit2.http.POST

interface ChaptersApi {
    @POST(ApiConstant.CHAPTERS)
    suspend fun chapters(): ResponseRemote<List<ChapterRemote>>
}