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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.tags.fix44.enums.Enum940AffirmStatus;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  940
 *  AffirmStatus
 *  int
 *  <p></p>
 *  Identifies the status of the ConfirmationAck.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Received
 *  <p>    2 - Confirm rejected, i.e. not affirmed
 *  <p>    3 - Affirmed
 */
public class Tag940EnuAffirmStatus extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum940AffirmStatus dataValue;

    public final static Enum940AffirmStatus TESTA_ENU_AFFIRM_STATUS
            = Enum940AffirmStatus.REJECTED;
    public final static Enum940AffirmStatus TESTB_ENU_AFFIRM_STATUS
            = Enum940AffirmStatus.AFFIRMED;

    public Tag940EnuAffirmStatus(Enum940AffirmStatus dataValue) {
        setFixType(FIX44.FIX940_ENU_AFFIRM_STATUS);
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
        Tag940EnuAffirmStatus tagData;

        tagData = new Tag940EnuAffirmStatus(TESTA_ENU_AFFIRM_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag940EnuAffirmStatus(TESTB_ENU_AFFIRM_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum940AffirmStatus oneEnum : Enum940AffirmStatus.values()) {
            System.out.println( new Tag940EnuAffirmStatus(oneEnum).toVerboseString() );
        }
    }
}
