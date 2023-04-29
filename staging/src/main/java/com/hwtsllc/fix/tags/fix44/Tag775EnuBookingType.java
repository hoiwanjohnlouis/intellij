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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.enums.fix44.Enum775BookingType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  775
 *  BookingType
 *  int
 *  <p></p>
 *  Method for booking out this order.
 *  <p></p>
 *  Used when notifying a broker that an order to be settled by that broker
 *  is to be booked out as an OTC derivative (e.g. CFD or similar).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular booking
 *  <p>    1 - CFD (Contract for difference)
 *  <p>    2 - Total Return Swap
 */
public class Tag775EnuBookingType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum775BookingType dataValue;

    public final static Enum775BookingType TESTA_ENU_BOOKING_TYPE
            = Enum775BookingType.REGULAR_BOOKING;
    public final static Enum775BookingType TESTB_ENU_BOOKING_TYPE
            = Enum775BookingType.CONTRACT_FOR_DIFFERENCE;

    public Tag775EnuBookingType(Enum775BookingType dataValue) {
        setFixType(FIX44.FIX775_ENU_BOOKING_TYPE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag775EnuBookingType tagData;

        tagData = new Tag775EnuBookingType(TESTA_ENU_BOOKING_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag775EnuBookingType(TESTB_ENU_BOOKING_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum775BookingType oneEnum : Enum775BookingType.values()) {
            System.out.println( new Tag775EnuBookingType(oneEnum).toVerboseString() );
        }
    }
}
