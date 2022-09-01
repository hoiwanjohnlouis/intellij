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
import com.hwtsllc.fixengine2022.fix43.enums.Enum560SecurityRequestResult;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  560
 *  SecurityRequestResult
 *  int
 *  <p></p>
 *  The results returned to a Security Request message
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Valid request
 *  <p>    1 - Invalid or unsupported request
 *  <p>    2 - No instruments found that match selection criteria
 *  <p>    3 - Not authorized to retrieve instrument data
 *  <p>    4 - Instrument data temporarily unavailable
 *  <p>    5 - Request for instrument data not supported
 */
public class Tag560EnuSecurityRequestResult extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum560SecurityRequestResult dataValue;

    public final static Enum560SecurityRequestResult TESTA_ENU_SECURITY_REQUEST_RESULT
            = Enum560SecurityRequestResult.VALID_REQUEST;
    public final static Enum560SecurityRequestResult TESTB_ENU_SECURITY_REQUEST_RESULT
            = Enum560SecurityRequestResult.REQUEST_NOT_SUPPORTED;

    public Tag560EnuSecurityRequestResult(Enum560SecurityRequestResult dataValue) {
        setFixType(FIX43.FIX560_ENU_SECURITY_REQUEST_RESULT);
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
        return dataValue.toEnumNameString();
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
        Tag560EnuSecurityRequestResult tagData;

        tagData = new Tag560EnuSecurityRequestResult(TESTA_ENU_SECURITY_REQUEST_RESULT);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag560EnuSecurityRequestResult(TESTB_ENU_SECURITY_REQUEST_RESULT);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            System.out.println( new Tag560EnuSecurityRequestResult(oneEnum).toVerboseString() );
        }
    }
}
