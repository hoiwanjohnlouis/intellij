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
import com.hwtsllc.fixengine2022.fix43.enums.Enum653SecDefStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  653
 *  SecDefStatus
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.2
 *  <p></p>
 *  State of a security definition request made to a market.
 *  <p></p>
 *  Useful for markets, such as derivatives markets, where market participants
 *  are permitted to define instruments for subsequent trading
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Pending Approval
 *  <p>    1 - Approved (Accepted)
 *  <p>    2 - Rejected
 *  <p>    3 - Unauthorized Request
 *  <p>    4 - Invalid Definition Request
 */
// @Deprecated
public class Tag653EnuSecDefStatus extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum653SecDefStatus dataValue;

    public final static Enum653SecDefStatus TESTA_ENU_SEC_DEF_STATUS
            = Enum653SecDefStatus.APPROVED;
    public final static Enum653SecDefStatus TESTB_ENU_SEC_DEF_STATUS
            = Enum653SecDefStatus.UNAUTHORIZED;

    public Tag653EnuSecDefStatus(Enum653SecDefStatus dataValue) {
        setFixType(FIX43.FIX653_ENU_SEC_DEF_STATUS);
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
     * standard wrapper to return a string describing the data
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
        Tag653EnuSecDefStatus tagData;

        tagData = new Tag653EnuSecDefStatus(TESTA_ENU_SEC_DEF_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag653EnuSecDefStatus(TESTB_ENU_SEC_DEF_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
