/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.fix43.enums.Enum589DayBookingInst;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  589
 *  DayBookingInst
 *  char
 *  <p></p>
 *  Indicates whether or not automatic booking can occur.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Can trigger booking without reference to the order initiator ("auto")
 *  <p>    1 - Speak with order initiator before booking ("speak first")
 *  <p>    2 - Accumulate
 */
public class Tag589EnuDayBookingInst extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum589DayBookingInst dataValue;

    public final static Enum589DayBookingInst TESTA_ENU_DAY_BOOKING_INST
            = Enum589DayBookingInst.AUTO_BOOKING;
    public final static Enum589DayBookingInst TESTB_ENU_DAY_BOOKING_INST
            = Enum589DayBookingInst.ACCUMULATE;

    public Tag589EnuDayBookingInst(Enum589DayBookingInst dataValue) {
        setFixType(FIX43.FIX589_ENU_DAY_BOOKING_INST);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag589EnuDayBookingInst tagData;

        tagData = new Tag589EnuDayBookingInst(TESTA_ENU_DAY_BOOKING_INST);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag589EnuDayBookingInst(TESTB_ENU_DAY_BOOKING_INST);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
