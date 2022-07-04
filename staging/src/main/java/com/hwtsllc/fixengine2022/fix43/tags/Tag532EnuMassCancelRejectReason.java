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
import com.hwtsllc.fixengine2022.fix43.enums.Enum532MassCancelRejectReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  532
 *  MassCancelRejectReason
 *  int
 *  <p></p>
 *  Reason Order Mass Cancel Request was rejected
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Mass Cancel Not Supported
 *  <p>    1 - Invalid or Unknown Security
 *  <p>    2 - Invalid or Unkown Underlying security
 *  <p>    3 - Invalid or Unknown Product
 *  <p>    4 - Invalid or Unknown CFICode
 *  <p></p>
 *  <p>    5 - Invalid or Unknown SecurityType
 *  <p>    6 - Invalid or Unknown Trading Session
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag532EnuMassCancelRejectReason extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum532MassCancelRejectReason dataValue;

    public final static Enum532MassCancelRejectReason TESTA_ENU_MASS_CANCEL_REJECT_REASON
            = Enum532MassCancelRejectReason.MASS_CANCEL_NOT_SUPPORTED;
    public final static Enum532MassCancelRejectReason TESTB_ENU_MASS_CANCEL_REJECT_REASON
            = Enum532MassCancelRejectReason.UNKNOWN_UNDERLYING;

    public Tag532EnuMassCancelRejectReason(Enum532MassCancelRejectReason dataValue) {
        setFixType(FIX43.FIX532_ENU_MASS_CANCEL_REJECT_REASON);
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
        Tag532EnuMassCancelRejectReason tagData;

        tagData = new Tag532EnuMassCancelRejectReason(TESTA_ENU_MASS_CANCEL_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag532EnuMassCancelRejectReason(TESTB_ENU_MASS_CANCEL_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            System.out.println( new Tag532EnuMassCancelRejectReason(oneEnum).toVerboseString() );
        }
    }
}
