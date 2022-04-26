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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum775BookingType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  775
 *  BookingType
 *  Method for booking out this order.
 *      Used when notifying a broker that an order to be settled by that broker
 *      is to be booked out as an OTC derivative (e.g. CFD or similar).
 *  Valid values:
 *      0 - Regular booking
 *      1 - CFD (Contract for difference)
 *      2 - Total Return Swap
 */
public class Tag775EnuBookingType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum775BookingType dataValue;

    public final static Enum775BookingType TESTA_ENU_BOOKING_TYPE
            = Enum775BookingType.REGULAR_BOOKING;
    public final static Enum775BookingType TESTB_ENU_BOOKING_TYPE
            = Enum775BookingType.CONTRACT_FOR_DIFFERENCE;

    public Tag775EnuBookingType(Enum775BookingType dataValue) {
        setFixType(FIX44.FIX775_ENU_BOOKING_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
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
        Tag775EnuBookingType tagData;

        tagData = new Tag775EnuBookingType(TESTA_ENU_BOOKING_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag775EnuBookingType(TESTB_ENU_BOOKING_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
