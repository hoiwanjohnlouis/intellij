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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  728
 *  PosReqResult
 *  int
 *  <p></p>
 *  Result of Request for Position
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Valid request
 *  <p>    1 - Invalid or unsupported request
 *  <p>    2 - No positions found that match criteria
 *  <p>    3 - Not authorized to request positions
 *  <p>    4 - Request for position not supported
 *  <p></p>
 *  <p>    99 - Other (use Text (58) in conjunction with this code for an explanation)
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag728EnuPosReqResult extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum728PosReqResult dataValue;

    public final static Enum728PosReqResult TESTA_ENU_POS_REQ_RESULT
            = Enum728PosReqResult.VALID_REQUEST;
    public final static Enum728PosReqResult TESTB_ENU_POS_REQ_RESULT
            = Enum728PosReqResult.REQUEST_NOT_SUPPORTED;

    public Tag728EnuPosReqResult(Enum728PosReqResult dataValue) {
        setFixType(FIX44.FIX728_ENU_POS_REQ_RESULT);
        this.dataValue = dataValue;
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag728EnuPosReqResult tagData;

        tagData = new Tag728EnuPosReqResult(TESTA_ENU_POS_REQ_RESULT);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag728EnuPosReqResult(TESTB_ENU_POS_REQ_RESULT);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            System.out.println( new Tag728EnuPosReqResult(oneEnum).toVerboseString() );
        }
    }
}
