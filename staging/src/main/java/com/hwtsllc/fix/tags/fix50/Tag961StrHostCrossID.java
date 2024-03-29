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
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  961
 *  HostCrossID
 *  String
 *  <p>
 *  Host assigned entity ID that can be used to reference all components of a cross;
 *  sides + strategy + legs.
 *  <p></p>
 *  Used as the primary key with which to refer to the Cross Order for cancellation and replace.
 *  <p></p>
 *  The HostCrossID will also be used to link together components of the Cross Order.
 *  <p></p>
 *  i.e. each individual Execution Report associated with the order will carry
 *  HostCrossID in order to tie back to the original cross order.
 */
public class Tag961StrHostCrossID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_HOST_CROSS_ID
            = "HiromiOshima-Tag961StrHostCrossID";
    public final static String TESTB_STR_HOST_CROSS_ID
            = "HopeMarieCarlton-Tag961StrHostCrossID";

    public Tag961StrHostCrossID(MyStringType dataValue) {
        setFixType(FIX50.FIX961_STR_HOST_CROSS_ID);
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
                ;
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
        Tag961StrHostCrossID tagData;

        tagData = new Tag961StrHostCrossID(new MyStringType(TESTA_STR_HOST_CROSS_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag961StrHostCrossID(new MyStringType(TESTB_STR_HOST_CROSS_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
