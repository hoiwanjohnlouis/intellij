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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  961
 *  HostCrossID
 *  String
 *  <p>
 *  Host assigned entity ID that can be used to reference all components of a cross;
 *  sides + strategy + legs.
 *  <p>
 *  Used as the primary key with which to refer to the Cross Order for cancellation and replace.
 *  <p>
 *  The HostCrossID will also be used to link together components of the Cross Order.
 *  <p>
 *  i.e. each individual Execution Report associated with the order will carry
 *  HostCrossID in order to tie back to the original cross order.
 */
public class Tag961StrHostCrossID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_HOST_CROSS_ID
            = "BilboBaggins-Tag961StrHostCrossID";
    public final static String TESTB_STR_HOST_CROSS_ID
            = "Gandalf-Tag961StrHostCrossID";

    public Tag961StrHostCrossID(MyStringType dataValue) {
        setFixType(FIX50.FIX961_STR_HOST_CROSS_ID);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        Tag961StrHostCrossID tagData;

        tagData = new Tag961StrHostCrossID(new MyStringType(TESTA_STR_HOST_CROSS_ID) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag961StrHostCrossID(new MyStringType(TESTB_STR_HOST_CROSS_ID) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
