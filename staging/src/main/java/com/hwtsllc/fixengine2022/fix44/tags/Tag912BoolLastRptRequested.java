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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  912
 *  LastRptRequested
 *  Boolean
 *  Indicates whether this message is that last report message in response
 *  to a request, such as Order Mass Status Request.
 *  Valid values:
 *      N - Not last message
 *      Y - Last message
 */
public class Tag912BoolLastRptRequested extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyBooleanType dataValue;

    public final static MyBooleanType TESTA_BOOL_LAST_RPT_REQUESTED = MyBooleanType.NO ;
    // N - Not last message
    public final static MyBooleanType TESTB_BOOL_LAST_RPT_REQUESTED = MyBooleanType.YES;
    // Y - Last message

    public Tag912BoolLastRptRequested(MyBooleanType dataValue) {
        setFixType(FIX44.FIX912_BOOL_LAST_RPT_REQUESTED);
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
        Tag912BoolLastRptRequested tagData;

        tagData = new Tag912BoolLastRptRequested(TESTA_BOOL_LAST_RPT_REQUESTED);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag912BoolLastRptRequested(TESTB_BOOL_LAST_RPT_REQUESTED);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
