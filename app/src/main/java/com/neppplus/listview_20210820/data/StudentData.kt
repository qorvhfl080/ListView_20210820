package com.neppplus.listview_20210820.data

class StudentData(val name: String, val birthYear: Int, val address: String) {

//    학생의 기능으로 -> 나이를 알려주는 기능

    fun getKoreanAgeByYear(year: Int) : Int {

        val age = year - this.birthYear + 1

        return age
    }

}