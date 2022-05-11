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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1036ExecAckStatus;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  1036
 *  ExecAckStatus
 *  char
 *  <p>
 *  The status of this execution acknowledgement message.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Received, not yet processed
 *  <p>    1 - Accepted
 *  <p>    2 - Don't know / Rejected
 */
public class Tag1036EnuExecAckStatus extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum1036ExecAckStatus dataValue;

    public final static Enum1036ExecAckStatus TESTA_ENU_EXEC_ACK_STATUS
            = Enum1036ExecAckStatus.ACCEPTED;
    public final static Enum1036ExecAckStatus TESTB_ENU_EXEC_ACK_STATUS
            = Enum1036ExecAckStatus.DONT_KNOW_REJECTED;

    public Tag1036EnuExecAckStatus(Enum1036ExecAckStatus dataValue) {
        setFixType(FIX50.FIX1036_ENU_EXEC_ACK_STATUS);
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
        Tag1036EnuExecAckStatus tagData;

        tagData = new Tag1036EnuExecAckStatus(TESTA_ENU_EXEC_ACK_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag1036EnuExecAckStatus(TESTB_ENU_EXEC_ACK_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
