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
import com.hwtsllc.fixengine2022.fix43.enums.Enum514RegistTransType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  514
 *  RegistTransType
 *  char
 *  <p></p>
 *  Identifies Registration Instructions transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    2 - Cancel
 *  <p>    1 - Replace
 */
public class Tag514EnuRegistTransType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum514RegistTransType dataValue;

    public final static Enum514RegistTransType TESTA_ENU_REGIST_TRANS_TYPE
            = Enum514RegistTransType.CANCEL;
    public final static Enum514RegistTransType TESTB_ENU_REGIST_TRANS_TYPE
            = Enum514RegistTransType.NEW;

    public Tag514EnuRegistTransType(Enum514RegistTransType dataValue) {
        setFixType(FIX43.FIX514_ENU_REGIST_TRANS_TYPE);
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
        Tag514EnuRegistTransType tagData;

        tagData = new Tag514EnuRegistTransType(TESTA_ENU_REGIST_TRANS_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag514EnuRegistTransType(TESTB_ENU_REGIST_TRANS_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
