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
import com.hwtsllc.fixengine2022.fix42.enums.Enum285DeleteReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  285
 *  DeleteReason
 *  char
 *  <p>
 *  Reason for deletion.
 *  <p></p>
 *  Valid values:
 *  <p>    0-1 msg types
 *  <p>    CANCELLATION_OR_TRADE_BUST( "0", "CANCELLATION_OR_TRADE_BUST", "0 - Cancellation / Trade Bust" ),
 *  <p>    ERROR( "1", "ERROR", "1 - Error" ),
 */
public class Tag285EnuDeleteReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum285DeleteReason dataValue;

    public final static Enum285DeleteReason TESTA_ENU_DELETE_REASON
            = Enum285DeleteReason.ERROR;
    public final static Enum285DeleteReason TESTB_ENU_DELETE_REASON
            = Enum285DeleteReason.CANCELLATION_OR_TRADE_BUST;

    public Tag285EnuDeleteReason(Enum285DeleteReason dataValue) {
        setFixType(FIX42.FIX285_ENU_DELETE_REASON);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        Tag285EnuDeleteReason tagData;

        tagData = new Tag285EnuDeleteReason(TESTA_ENU_DELETE_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag285EnuDeleteReason(TESTB_ENU_DELETE_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum285DeleteReason oneEnum : Enum285DeleteReason.values()) {
            System.out.println( new Tag285EnuDeleteReason(oneEnum).toVerboseString() );
        }
    }
}
