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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum434CxlRejResponseTo;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag434EnuCxlRejResponseTo extends FIX42Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum434CxlRejResponseTo dataValue;

    public final static Enum434CxlRejResponseTo TESTA_ENU_CXL_REJ_RESPONSE_TO
            = Enum434CxlRejResponseTo.ORDER_CANCEL_REQUEST;
    public final static Enum434CxlRejResponseTo TESTB_ENU_CXL_REJ_RESPONSE_TO
            = Enum434CxlRejResponseTo.ORDER_MODIFICATION_REQUEST;

    public Tag434EnuCxlRejResponseTo(Enum434CxlRejResponseTo dataValue) {
        setFixType(FIX42.FIX434_ENU_CXL_REJ_RESPONSE_TO);
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
        Tag434EnuCxlRejResponseTo tagData;

        tagData = new Tag434EnuCxlRejResponseTo(TESTA_ENU_CXL_REJ_RESPONSE_TO);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag434EnuCxlRejResponseTo(TESTB_ENU_CXL_REJ_RESPONSE_TO);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
