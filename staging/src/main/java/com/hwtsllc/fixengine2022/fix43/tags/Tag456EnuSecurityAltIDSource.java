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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  22
 *  (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
 *  SecurityIDSource
 *  String
 *  Identifies class or source of the SecurityID (48) value.  Required if SecurityID is specified.
 *                  100+ are reserved for private security identifications
 *  305
 *  UnderlyingSecurityIDSource
 *  String
 *  Underlying security’s SecurityIDSource.
 *                  Valid values:   See SecurityIDSource (22) field
 *  456
 *  SecurityAltIDSource
 *  String
 *  Identifies class or source of the SecurityAltID (455) value.  Required if SecurityAltID is specified.
 *                  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  459
 *  UnderlyingSecurityAltIDSource
 *  String
 *  Identifies class or source of the UnderlyingSecurityAltID (458) value.  Required if UnderlyingSecurityAltID is specified.
 *                  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  603
 *  LegSecurityIDSource
 *  String
 *  Multileg instrument's individual  security’s SecurityIDSource.
 *                  Valid values:   See SecurityIDSource (22) field for description
 *  606
 *  LegSecurityAltIDSource
 *  String
 *  Multileg instrument's individual  security’s SecurityAltIDSource.
 *                  Valid values:   See SecurityAltIDSource (456) field for description
 *  761
 *  BenchmarkSecurityIDSource
 *  Identifies class or source of the BenchmarkSecurityID (699) value.
 *  Required if BenchmarkSecurityID is specified.
 *              Same values as the SecurityIDSource (22) field
 *  1096
 *  PegSecurityIDSource
 *  String
 *  Defines the identity of the security off whose prices the order will peg.
 *                  Valid values:   See SecurityIDSource (22) field for description
 *  1105
 *  TriggerSecurityIDSource
 *  String
 *  Defines the identity of the security whose prices will be tracked by the trigger logic.
 *                  Valid values:   See SecurityIDSource (22) field for description
 *
 *  Valid values:
 *      1 - CUSIP
 *      2 - SEDOL
 *      3 - QUIK
 *      4 - ISIN number
 *      5 - RIC code
 *      6 - ISO Currency Code
 *      7 - ISO Country Code
 *      8 - Exchange Symbol
 *      9 - Consolidated Tape Association (CTA) Symbol
 *              (SIAC CTS/CQS line format)
 *      A - Bloomberg Symbol
 *      B - Wertpapier
 *      C - Dutch
 *      D - Valoren
 *      E - Sicovam
 *      F - Belgian
 *      G - "Common" (Clearstream and Euroclear)
 *      H - Clearing House / Clearing Organization
 *      I - ISDA/FpML Product Specification
 *              (XML in EncodedSecurityDesc)
 *      J - Option Price Reporting Authority
 *      K - ISDA/FpML Product URL (URL in SecurityID)
 *      L - Letter of Credit
 */
public class Tag456EnuSecurityAltIDSource extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumSecurityIDSource dataValue;

    public final static MyEnumSecurityIDSource TESTA_ENU_SECURITY_ALT_ID_SOURCE
            = MyEnumSecurityIDSource.BELGIAN;
    public final static MyEnumSecurityIDSource TESTB_ENU_SECURITY_ALT_ID_SOURCE
            = MyEnumSecurityIDSource.RIC;

    public Tag456EnuSecurityAltIDSource(MyEnumSecurityIDSource dataValue) {
        setFixType(FIX43.FIX456_ENU_SECURITY_ALT_ID_SOURCE);
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
        Tag456EnuSecurityAltIDSource tagData;

        tagData = new Tag456EnuSecurityAltIDSource(TESTA_ENU_SECURITY_ALT_ID_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag456EnuSecurityAltIDSource(TESTB_ENU_SECURITY_ALT_ID_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
