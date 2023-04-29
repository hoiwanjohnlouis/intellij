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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.enums.fix50.Enum1081RefOrderIDSource;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1081
 *  RefOrderIDSource
 *  char
 *  <p>
 *  Used to specify what identifier, provided in order depth market data, to use when hitting (taking) a specific order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - SecondaryOrdeID (198)
 *  <p>    1 - OrdeID (37)
 *  <p>    2 - MEntryID (278)
 *  <p>    3 - QuotEntryID (299)
 */
public class Tag1081EnuRefOrderIDSource extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1081RefOrderIDSource dataValue;

    public final static Enum1081RefOrderIDSource TESTA_ENU_REF_ORDER_ID_SOURCE
            = Enum1081RefOrderIDSource.ORDE_ID;
    public final static Enum1081RefOrderIDSource TESTB_ENU_REF_ORDER_ID_SOURCE
            = Enum1081RefOrderIDSource.QUOT_ENTRY_ID;

    public Tag1081EnuRefOrderIDSource(Enum1081RefOrderIDSource dataValue) {
        setFixType(FIX50.FIX1081_ENU_REF_ORDER_ID_SOURCE);
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
        Tag1081EnuRefOrderIDSource tagData;

        tagData = new Tag1081EnuRefOrderIDSource(TESTA_ENU_REF_ORDER_ID_SOURCE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1081EnuRefOrderIDSource(TESTB_ENU_REF_ORDER_ID_SOURCE);
        System.out.println(tagData.toVerboseString());
    }
}
