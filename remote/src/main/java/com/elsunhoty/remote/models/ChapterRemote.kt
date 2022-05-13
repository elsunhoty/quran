package com.elsunhoty.remote.models

import com.google.gson.annotations.SerializedName

data class ChapterRemote(
    @SerializedName("number")
    val number: Int,
    @SerializedName("sequence")
    val sequence: Int,
    @SerializedName("numberOfVerses")
    val numberOfVerses: Int,
    @SerializedName("name")
    val chapterName: ChapterNameRemote,
    @SerializedName("revelation")
    val revelation: RevelationRemote
)

data class ChapterNameRemote(
    @SerializedName("long")
    val chapterName: String,
    @SerializedName("transliteration")
    val translatedName: TranslatedNameRemote,

    )

data class TranslatedNameRemote(
    @SerializedName("en")
    val englishName: String
)

data class RevelationRemote(
    @SerializedName("en")
    val MeccanOrNot: String
)