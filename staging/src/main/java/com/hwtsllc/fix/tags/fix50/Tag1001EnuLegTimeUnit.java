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
import com.hwtsllc.fix.datatypes.MyEnumTimeUnit;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  997 (same as 997, 1000, 1001)
 *  TimeUnit
 *  String
 *  <p>
 *  Unit of time associated with the contract.
 *  <p></p>
 *  NOTE: Additional values may be used by mutual agreement of the counterparties
 *  <p></p>
 *  1000
 *  UnderlyingTimeUnit
 *  String
 *  <p>
 *  Same as TimeUnit (997).
 *  <p></p>
 *  1001
 *  LegTimeUnit
 *  String
 *  <p>
 *  Same as TimeUnit (997).
 *  <p></p>
 *  Valid values:
 *  <p>    H - Hour
 *  <p>    Min - Minute
 *  <p>    S - Second
 *  <p></p>
 *  <p>    D - Day
 *  <p>    Wk - Week
 *  <p>    Mo - Month
 *  <p>    Yr - Year
 */
public class Tag1001EnuLegTimeUnit extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumTimeUnit dataValue;

    public final static MyEnumTimeUnit TESTA_ENU_LEG_TIME_UNIT
            = MyEnumTimeUnit.DD;
    public final static MyEnumTimeUnit TESTB_ENU_LEG_TIME_UNIT
            = MyEnumTimeUnit.SS;

    public Tag1001EnuLegTimeUnit(MyEnumTimeUnit dataValue) {
        setFixType(FIX50.FIX1001_ENU_LEG_TIME_UNIT);
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
        Tag1001EnuLegTimeUnit tagData;

        tagData = new Tag1001EnuLegTimeUnit(TESTA_ENU_LEG_TIME_UNIT);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1001EnuLegTimeUnit(TESTB_ENU_LEG_TIME_UNIT);
        System.out.println(tagData.toVerboseString());
    }
}
