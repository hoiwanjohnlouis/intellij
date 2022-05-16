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
import com.hwtsllc.fixengine2022.fix44.enums.Enum808AllocIntermedReqType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  808
 *  AllocIntermedReqType
 *  int
 *  Response to allocation to be communicated to a counterparty through an intermediary,
 *  i.e. clearing house.
 *  Used in conjunction with AllocType = Request to Intermediary
 *  and AllocReportType = Request to Intermediary
 *  Valid values:
 *      1 - Pending Accept
 *      2 - Pending Release
 *      3 - Pending Reversal
 *      4 - Accept
 *      5 - Block Level Reject
 *      6 - Account Level Reject
 */
public class Tag808EnuAllocIntermedReqType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum808AllocIntermedReqType dataValue;

    public final static Enum808AllocIntermedReqType TESTA_ENU_ALLOC_INTERMED_REQ_TYPE
            = Enum808AllocIntermedReqType.ACCEPT;
    public final static Enum808AllocIntermedReqType TESTB_ENU_ALLOC_INTERMED_REQ_TYPE
            = Enum808AllocIntermedReqType.BLOCK_LEVEL_REJECT;

    public Tag808EnuAllocIntermedReqType(Enum808AllocIntermedReqType dataValue) {
        setFixType(FIX44.FIX808_ENU_ALLOC_INTERMED_REQ_TYPE);
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
        Tag808EnuAllocIntermedReqType tagData;

        tagData = new Tag808EnuAllocIntermedReqType(TESTA_ENU_ALLOC_INTERMED_REQ_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag808EnuAllocIntermedReqType(TESTB_ENU_ALLOC_INTERMED_REQ_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
