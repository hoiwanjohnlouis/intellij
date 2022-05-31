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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  593
 *  UnderlyingStateOrProvinceOfIssue
 *  String
 *  <p>
 *  Underlying security’s StateOrProvinceOfIssue.
 *  <p>
 *  See StateOrProvinceOfIssue (471) field for description
 */
public class Tag593StrUnderlyingStateOrProvinceOfIssue extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE
            = "BilboBaggins-Tag593StrUnderlyingStateOrProvinceOfIssue";
    public final static String TESTB_STR_UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE
            = "Gandalf-Tag593StrUnderlyingStateOrProvinceOfIssue";

    public Tag593StrUnderlyingStateOrProvinceOfIssue(MyStringType dataValue) {
        setFixType(FIX43.FIX593_STR_UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE);
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
        Tag593StrUnderlyingStateOrProvinceOfIssue tagData;

        tagData = new Tag593StrUnderlyingStateOrProvinceOfIssue(new MyStringType(TESTA_STR_UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag593StrUnderlyingStateOrProvinceOfIssue(new MyStringType(TESTB_STR_UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
