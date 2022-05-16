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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyBooleanType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  852
 *  PublishTrdIndicator
 *  Boolean
 *  Indicates if a trade should be reported via a market reporting service.
 *  Valid values:
 *      N - Do Not Report Trade
 *      Y - Report Trade
 */
public class Tag852BoolPublishTrdIndicator extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyBooleanType dataValue;

    public final static MyBooleanType TESTA_BOOL_REVERSAL_INDICATOR = MyBooleanType.NO ;
    // N - Do Not Report Trade
    public final static MyBooleanType TESTB_BOOL_REVERSAL_INDICATOR = MyBooleanType.YES;
    // Y - Report Trade

    public Tag852BoolPublishTrdIndicator(MyBooleanType dataValue) {
        setFixType(FIX44.FIX852_BOOL_PUBLISH_TRD_INDICATOR);
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
        Tag852BoolPublishTrdIndicator tagData;

        tagData = new Tag852BoolPublishTrdIndicator(TESTA_BOOL_REVERSAL_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag852BoolPublishTrdIndicator(TESTB_BOOL_REVERSAL_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
