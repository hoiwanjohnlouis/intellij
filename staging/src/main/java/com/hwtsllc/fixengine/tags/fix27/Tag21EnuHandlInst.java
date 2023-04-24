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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.enums.fix27.Enum21HandlInst;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  21
 *  HandlInst
 *  char
 *  <p></p>
 *  Instructions for order handling on Broker trading floor
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Automated execution order, private, no Broker intervention
 *  <p>    2 - Automated execution order, public, Broker intervention OK
 *  <p>    3 - Manual order, best execution
 */
public class Tag21EnuHandlInst extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum21HandlInst dataValue;

    public final static Enum21HandlInst TESTA_ENU_HANDL_INST
            = Enum21HandlInst.AUTOMATIC_EXECUTION_NO_BROKER;
    public final static Enum21HandlInst TESTB_ENU_HANDL_INST
            = Enum21HandlInst.AUTOMATIC_EXECUTION_BROKER_OKAY;

    public Tag21EnuHandlInst(Enum21HandlInst dataValue) {
        setFixType(FIX27.FIX21_ENU_HANDL_INST);
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
        System.out.println( new Tag21EnuHandlInst(TESTA_ENU_HANDL_INST).toVerboseString() );
        System.out.println( new Tag21EnuHandlInst(TESTB_ENU_HANDL_INST).toVerboseString() );

        // loop around the ENUM and display
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            System.out.println( new Tag21EnuHandlInst(oneEnum).toVerboseString() );
        }
    }
}
