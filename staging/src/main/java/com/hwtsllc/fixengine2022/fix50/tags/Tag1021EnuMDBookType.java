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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1021MDBookType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  1021
 *  MDBookType
 *  int
 *  <p>
 *  Describes the type of book for which the feed is intended.
 *  <p>
 *  Used when multiple feeds are provided over the same connection
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Top of Book
 *  <p>    2 - Price Depth
 *  <p>    3 - Order Depth
 */
public class Tag1021EnuMDBookType extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum1021MDBookType dataValue;

    public final static Enum1021MDBookType TESTA_ENU_MD_BOOK_TYPE
            = Enum1021MDBookType.TOP_OF_BOOK;
    public final static Enum1021MDBookType TESTB_ENU_MD_BOOK_TYPE
            = Enum1021MDBookType.ORDER_DEPTH;

    public Tag1021EnuMDBookType(Enum1021MDBookType dataValue) {
        setFixType(FIX50.FIX1021_ENU_MD_BOOK_TYPE);
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
        Tag1021EnuMDBookType tagData;

        tagData = new Tag1021EnuMDBookType(TESTA_ENU_MD_BOOK_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag1021EnuMDBookType(TESTB_ENU_MD_BOOK_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
