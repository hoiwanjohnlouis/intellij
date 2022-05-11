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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumTimeUnit;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  997 (same as 997, 1000, 1001)
 *  TimeUnit
 *  String
 *  <p>
 *  Unit of time associated with the contract.
 *  <p>
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
public class Tag1001EnuLegTimeUnit extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumTimeUnit dataValue;

    public final static MyEnumTimeUnit TESTA_ENU_LEG_TIME_UNIT
            = MyEnumTimeUnit.DD;
    public final static MyEnumTimeUnit TESTB_ENU_LEG_TIME_UNIT
            = MyEnumTimeUnit.SS;

    public Tag1001EnuLegTimeUnit(MyEnumTimeUnit dataValue) {
        setFixType(FIX50.FIX1001_ENU_LEG_TIME_UNIT);
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
        Tag1001EnuLegTimeUnit tagData;

        tagData = new Tag1001EnuLegTimeUnit(TESTA_ENU_LEG_TIME_UNIT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag1001EnuLegTimeUnit(TESTB_ENU_LEG_TIME_UNIT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
