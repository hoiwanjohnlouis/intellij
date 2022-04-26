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
import com.hwtsllc.fixengine2022.fix44.enums.Enum728PosReqResult;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  728
 *  PosReqResult
 *  Result of Request for Position
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Valid request
 *      1 - Invalid or unsupported request
 *      2 - No positions found that match criteria
 *      3 - Not authorized to request positions
 *      4 - Request for position not supported
 *      99 - Other (use Text (58) in conjunction with this code for an explanation)
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Tag728EnuPosReqResult extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum728PosReqResult dataValue;

    public final static Enum728PosReqResult TESTA_ENU_POS_REQ_RESULT
            = Enum728PosReqResult.VALID_REQUEST;
    public final static Enum728PosReqResult TESTB_ENU_POS_REQ_RESULT
            = Enum728PosReqResult.REQUEST_NOT_SUPPORTED;

    public Tag728EnuPosReqResult(Enum728PosReqResult dataValue) {
        setFixType(FIX44.FIX728_ENU_POS_REQ_RESULT);
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
        Tag728EnuPosReqResult tagData;

        tagData = new Tag728EnuPosReqResult(TESTA_ENU_POS_REQ_RESULT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag728EnuPosReqResult(TESTB_ENU_POS_REQ_RESULT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
