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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1024MDOriginType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1024
 *  MDOriginType
 *  int
 *  <p>
 *  Used to describe the origin of an entry in the book
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Book
 *  <p>    1 - Off-Book
 *  <p>    2 - Cross
 */
public class Tag1024EnuMDOriginType extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final Enum1024MDOriginType dataValue;

    public final static Enum1024MDOriginType TESTA_ENU_MD_ORIGIN_TYPE
            = Enum1024MDOriginType.BOOK;
    public final static Enum1024MDOriginType TESTB_ENU_MD_ORIGIN_TYPE
            = Enum1024MDOriginType.CROSS;

    public Tag1024EnuMDOriginType(Enum1024MDOriginType dataValue) {
        setFixType(FIX50.FIX1024_ENU_MD_ORIGIN_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        Tag1024EnuMDOriginType tagData;

        tagData = new Tag1024EnuMDOriginType(TESTA_ENU_MD_ORIGIN_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1024EnuMDOriginType(TESTB_ENU_MD_ORIGIN_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
