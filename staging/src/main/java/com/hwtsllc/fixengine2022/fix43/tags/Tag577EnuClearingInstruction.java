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
import com.hwtsllc.fixengine2022.fix43.enums.Enum577ClearingInstruction;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  577
 *  ClearingInstruction
 *  int
 *  <p></p>
 *  Eligibility of this trade for clearing and central counterparty processing
 *  values above 4000 are reserved for agreement between parties
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Process normally
 *  <p>    1 - Exclude from all netting
 *  <p>    2 - Bilateral netting only
 *  <p>    3 - Ex clearing
 *  <p>    4 - Special trade
 *  <p></p>
 *  <p>    5 - Multilateral netting
 *  <p>    6 - Clear against central counterparty
 *  <p>    7 - Exclude from central counterparty
 *  <p>    8 - Manual mode (pre-posting and/or pre-giveup)
 *  <p>    9 - Automatic posting mode (trade posting to the position account number specified)
 *  <p></p>
 *  <p>    10 - Automatic give-up mode (trade give-up to the give-up destination number specified)
 *  <p>    11 - Qualified Service Representative QSR
 *  <p>    12 - Customer trade
 *  <p>    13 - Self clearing
 */
public class Tag577EnuClearingInstruction extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum577ClearingInstruction dataValue;

    public final static Enum577ClearingInstruction TESTA_ENU_CLEARING_INSTRUCTION
            = Enum577ClearingInstruction.SELF_CLEARING;
    public final static Enum577ClearingInstruction TESTB_ENU_CLEARING_INSTRUCTION
            = Enum577ClearingInstruction.EXCLUDE_FROM_CENTRAL_COUNTERPARTY;

    public Tag577EnuClearingInstruction(Enum577ClearingInstruction dataValue) {
        setFixType(FIX43.FIX577_ENU_CLEARING_INSTRUCTION);
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
        Tag577EnuClearingInstruction tagData;

        tagData = new Tag577EnuClearingInstruction(TESTA_ENU_CLEARING_INSTRUCTION);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag577EnuClearingInstruction(TESTB_ENU_CLEARING_INSTRUCTION);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            System.out.println( new Tag577EnuClearingInstruction(oneEnum).toVerboseString() );
        }
    }
}
