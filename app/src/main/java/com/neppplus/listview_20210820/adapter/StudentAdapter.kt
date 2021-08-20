package com.neppplus.listview_20210820.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listview_20210820.R
import com.neppplus.listview_20210820.data.StudentData

class StudentAdapter(val mContext: Context,
                     val resId: Int,
                     val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

//        row가 결과로 나가기 전에 추가 가공

//        mList의 학생 중 위치에 맞는 데이터를 뽑아서 row 내부의 텍스트뷰에 문구로 반영

        val data = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)

        nameTxt.text = data.name
        ageTxt.text = "${data.getKoreanAgeByYear(2021)}세"
        addressTxt.text = data.address

        return row

    }

}