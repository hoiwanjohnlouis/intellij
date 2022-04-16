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
import com.hwtsllc.fixengine2022.fix43.enums.Enum507RegistRejReasonCode;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag507EnuRegistRejReasonCode extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum507RegistRejReasonCode dataValue;

    public final static Enum507RegistRejReasonCode TESTA_ENU_REGIST_REJ_REASON_CODE
            = Enum507RegistRejReasonCode.INVALID_ACCOUNT_TYPE;
    public final static Enum507RegistRejReasonCode TESTB_ENU_REGIST_REJ_REASON_CODE
            = Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH;

    public Tag507EnuRegistRejReasonCode(Enum507RegistRejReasonCode dataValue) {
        setFixType(FIX43.FIX507_ENU_REGIST_REJ_REASON_CODE);
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
        Tag507EnuRegistRejReasonCode tagData;

        tagData = new Tag507EnuRegistRejReasonCode(TESTA_ENU_REGIST_REJ_REASON_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag507EnuRegistRejReasonCode(TESTB_ENU_REGIST_REJ_REASON_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
