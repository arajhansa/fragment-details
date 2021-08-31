package com.advayrajhansa.employeeportal.model

import android.os.Parcel
import android.os.Parcelable

data class ProfileDetails(
    val name: String = ""
) : Parcelable {

    constructor(parcel: Parcel) : this(parcel.readString() ?: "")

    override fun writeToParcel(parcel: Parcel, flags: Int) = parcel.writeString(name)

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<ProfileDetails> {
        override fun createFromParcel(parcel: Parcel): ProfileDetails = ProfileDetails(parcel)
        override fun newArray(size: Int): Array<ProfileDetails?> = arrayOfNulls(size)
    }

}
