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
import com.hwtsllc.fixengine2022.fix44.enums.Enum792SettlInstReqRejCode;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  792
 *  SettlInstReqRejCode
 *  Identifies reason for rejection (of a settlement instruction request message).
 *  Valid values:
 *      0 - Unable to process request
 *      1 - Unknown account
 *      2 - No matching settlement instructions found
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Tag792EnuSettlInstReqRejCode extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum792SettlInstReqRejCode dataValue;

    public final static Enum792SettlInstReqRejCode TESTA_ENU_SETTL_INST_REQ_REJ_CODE
            = Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS;
    public final static Enum792SettlInstReqRejCode TESTB_ENU_SETTL_INST_REQ_REJ_CODE
            = Enum792SettlInstReqRejCode.UNABLE_TO_PROCESS_REQUEST;

    public Tag792EnuSettlInstReqRejCode(Enum792SettlInstReqRejCode dataValue) {
        setFixType(FIX44.FIX792_ENU_SETTL_INST_REQ_REJ_CODE);
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
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
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
        Tag792EnuSettlInstReqRejCode tagData;

        tagData = new Tag792EnuSettlInstReqRejCode(TESTA_ENU_SETTL_INST_REQ_REJ_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag792EnuSettlInstReqRejCode(TESTB_ENU_SETTL_INST_REQ_REJ_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
