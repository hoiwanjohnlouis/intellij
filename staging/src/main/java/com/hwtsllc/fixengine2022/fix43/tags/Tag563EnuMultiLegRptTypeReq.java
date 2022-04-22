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
import com.hwtsllc.fixengine2022.fix43.enums.Enum563MultiLegRptTypeReq;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag563EnuMultiLegRptTypeReq extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum563MultiLegRptTypeReq dataValue;

    public final static Enum563MultiLegRptTypeReq TESTA_ENU_MULTI_LEG_RPT_TYPE_REQ
            = Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS;
    public final static Enum563MultiLegRptTypeReq TESTB_ENU_MULTI_LEG_RPT_TYPE_REQ
            = Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY;

    public Tag563EnuMultiLegRptTypeReq(Enum563MultiLegRptTypeReq dataValue) {
        setFixType(FIX43.FIX563_ENU_MULTI_LEG_RPT_TYPE_REQ);
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
        Tag563EnuMultiLegRptTypeReq tagData;

        tagData = new Tag563EnuMultiLegRptTypeReq(TESTA_ENU_MULTI_LEG_RPT_TYPE_REQ);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag563EnuMultiLegRptTypeReq(TESTB_ENU_MULTI_LEG_RPT_TYPE_REQ);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}