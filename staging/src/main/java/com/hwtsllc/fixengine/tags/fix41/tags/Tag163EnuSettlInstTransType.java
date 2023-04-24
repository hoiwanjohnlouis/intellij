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

package com.hwtsllc.fixengine.tags.fix41.tags;

import com.hwtsllc.fixengine.datatypes.FIX41;
import com.hwtsllc.fixengine.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine.tags.fix41.enums.Enum163SettlInstTransType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  163
 *  SettlInstTransType
 *  char
 *  <p></p>
 *  Settlement Instructions message transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    N - New
 *  <p>    C - Cancel
 *  <p>    R - Replace
 *  <p>    T - Restate
 */
public class Tag163EnuSettlInstTransType extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum163SettlInstTransType dataValue;

    public final static Enum163SettlInstTransType TESTA_ENU_SETTL_INST_TRANS_TYPE
            = Enum163SettlInstTransType.NEW;
    public final static Enum163SettlInstTransType TESTB_ENU_SETTL_INST_TRANS_TYPE
            = Enum163SettlInstTransType.RESTATE;

    public Tag163EnuSettlInstTransType(Enum163SettlInstTransType dataValue) {
        setFixType(FIX41.FIX163_ENU_SETTL_INST_TRANS_TYPE);
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
        return dataValue.toFIXDescriptionString();
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
        System.out.println( new Tag163EnuSettlInstTransType(TESTA_ENU_SETTL_INST_TRANS_TYPE).toVerboseString() );
        System.out.println( new Tag163EnuSettlInstTransType(TESTB_ENU_SETTL_INST_TRANS_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum163SettlInstTransType oneEnum : Enum163SettlInstTransType.values()) {
            System.out.println( new Tag163EnuSettlInstTransType(oneEnum).toVerboseString() );
        }
    }
}
