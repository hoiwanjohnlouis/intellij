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
import com.hwtsllc.fixengine2022.datatypes.MyEnumSecurityIDSource;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  22
 *  (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
 *  SecurityIDSource
 *  String
 *  <p>
 *  Identifies class or source of the SecurityID (48) value.  Required if SecurityID is specified.
 *  <p>
 *  100+ are reserved for private security identifications
 *  <p></p>
 *  305
 *  UnderlyingSecurityIDSource
 *  String
 *  <p>
 *  Underlying security’s SecurityIDSource.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field
 *  <p></p>
 *  456
 *  SecurityAltIDSource
 *  String
 *  <p>
 *  Identifies class or source of the SecurityAltID (455) value.  Required if SecurityAltID is specified.
 *  <p>
 *  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  <p></p>
 *  459
 *  UnderlyingSecurityAltIDSource
 *  String
 *  <p>
 *  Identifies class or source of the UnderlyingSecurityAltID (458) value.  Required if UnderlyingSecurityAltID is specified.
 *  <p>
 *  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  <p></p>
 *  603
 *  LegSecurityIDSource
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s SecurityIDSource.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field for description
 *  <p></p>
 *  606
 *  LegSecurityAltIDSource
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s SecurityAltIDSource.
 *  <p>
 *  Valid values:   See SecurityAltIDSource (456) field for description
 *  <p></p>
 *  761
 *  BenchmarkSecurityIDSource
 *  String
 *  <p>
 *  Identifies class or source of the BenchmarkSecurityID (699) value.
 *  <p>
 *  Required if BenchmarkSecurityID is specified.
 *  <p>
 *  Same values as the SecurityIDSource (22) field
 *  <p></p>
 *  1096
 *  PegSecurityIDSource
 *  String
 *  <p>
 *  Defines the identity of the security off whose prices the order will peg.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field for description
 *  <p></p>
 *  1105
 *  TriggerSecurityIDSource
 *  String
 *  <p>
 *  Defines the identity of the security whose prices will be tracked by the trigger logic.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    1 - CUSIP
 *  <p>    2 - SEDOL
 *  <p>    3 - QUIK
 *  <p>    4 - ISIN number
 *  <p>    5 - RIC code
 *  <p></p>
 *  <p>    6 - ISO Currency Code
 *  <p>    7 - ISO Country Code
 *  <p>    8 - Exchange Symbol
 *  <p>    9 - Consolidated Tape Association (CTA) Symbol
 *              (SIAC CTS/CQS line format)
 *  <p></p>
 *  <p>    A - Bloomberg Symbol
 *  <p>    B - Wertpapier
 *  <p>    C - Dutch
 *  <p>    D - Valoren
 *  <p>    E - Sicovam
 *  <p></p>
 *  <p>    F - Belgian
 *  <p>    G - "Common" (Clearstream and Euroclear)
 *  <p>    H - Clearing House / Clearing Organization
 *  <p>    I - ISDA/FpML Product Specification
 *              (XML in EncodedSecurityDesc)
 *  <p>    J - Option Price Reporting Authority
 *  <p></p>
 *  <p>    K - ISDA/FpML Product URL (URL in SecurityID)
 *  <p>    L - Letter of Credit
 */
public class Tag456EnuSecurityAltIDSource extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumSecurityIDSource dataValue;

    public final static MyEnumSecurityIDSource TESTA_ENU_SECURITY_ALT_ID_SOURCE
            = MyEnumSecurityIDSource.BELGIAN;
    public final static MyEnumSecurityIDSource TESTB_ENU_SECURITY_ALT_ID_SOURCE
            = MyEnumSecurityIDSource.RIC;

    public Tag456EnuSecurityAltIDSource(MyEnumSecurityIDSource dataValue) {
        setFixType(FIX43.FIX456_ENU_SECURITY_ALT_ID_SOURCE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
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
        Tag456EnuSecurityAltIDSource tagData;

        tagData = new Tag456EnuSecurityAltIDSource(TESTA_ENU_SECURITY_ALT_ID_SOURCE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag456EnuSecurityAltIDSource(TESTB_ENU_SECURITY_ALT_ID_SOURCE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            System.out.println( new Tag456EnuSecurityAltIDSource(oneEnum).toVerboseString() );
        }
    }
}
