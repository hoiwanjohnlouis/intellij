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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.fix41.enums.Enum165SettlInstSource;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  165
 *  SettlInstSource
 *  char
 *  <p>
 *  Indicates source of Settlement Instructions
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Broker's Instructions
 *  <p>    2 - Institution's Instructions
 *  <p>    3 - Investor (e.g. CIV use)
 */
public class Tag165EnuSettlInstSource extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum165SettlInstSource dataValue;

    public final static Enum165SettlInstSource TESTA_ENU_SETTL_INST_SOURCE = Enum165SettlInstSource.BROKER_INSTRUCTIONS;
    public final static Enum165SettlInstSource TESTB_ENU_SETTL_INST_SOURCE = Enum165SettlInstSource.INVESTOR;

    public Tag165EnuSettlInstSource(Enum165SettlInstSource dataValue) {
        setFixType(FIX41.FIX165_ENU_SETTL_INST_SOURCE);
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
        System.out.println( new Tag165EnuSettlInstSource(TESTA_ENU_SETTL_INST_SOURCE).toVerboseString() );
        System.out.println( new Tag165EnuSettlInstSource(TESTB_ENU_SETTL_INST_SOURCE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            System.out.println( new Tag165EnuSettlInstSource(oneEnum).toVerboseString() );
        }
    }
}
