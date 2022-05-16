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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum829TrdSubType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  829
 *  TrdSubType
 *  int
 *  Further qualification to the trade type
 *  Valid values:
 *      0 - CMTA
 *      1 - Internal transfer or adjustment
 *      2 - External transfer or transfer of account
 *      3 - Reject for submitting side
 *      4 - Advisory for contra side
 *      5 - Offset due to an allocation
 *      6 - Onset due to an allocation
 *      7 - Differential spread
 *      8 - Implied spread leg executed against an outright
 *      9 - Transaction from exercise
 *      10 - Transaction from assignment
 *      11 - ACATS
 *
 *      MiFID Values
 *      14 - AI (Automated input facility disabled in response to an exchange request.)
 *      15 - B (Transaction between two member firms where neither member firm is
 *                  registered as a market maker in the security in
 *                  question and neither is a designated fund manager.
 *                  Also used by broker dealers when dealing with
 *                  another broker which is not a member firm.
 *                  Non-order book securities only.)
 *      16 - K (Transaction using block trade facility.)
 *      17 - LC (Correction submitted more than three days after
 *                  publication of the original trade report.)
 *      18 - M (Transaction, other than a transaction resulting
 *                  from a stock swap or stock switch, between
 *                  two market makers registered in that security
 *                  including IDB or a public display system trades.
 *                  Non-order book securities only.)
 *      19 - N (Non-protected portfolio transaction or a fully disclosed portfolio transaction)
 *      20 - NM (
 *                    i) transaction where Exchange has granted permission for non-publication
 *                   ii) IDB is reporting as seller
 *                  iii) submitting a transaction report to the Exchange,
 *                       where the transaction report is not also a trade report.
 *              )
 *      21 - NR (Non-risk transaction in a SEATS security other than an AIM security)
 *      22 - P (Protected portfolio transaction or a worked principal agreement to
 *                  effect a portfolio transaction which includes order book securities)
 *      23 - PA (Protected transaction notification)
 *      24 - PC (Contra trade for transaction which took place on a previous day
 *                  and which was automatically executed on the Exchange trading system)
 *      25 - PN (Worked principal notification for a portfolio transaction
 *                  which includes order book securities)
 *      26 - R (
 *                    i) riskless principal transaction between non-members
 *                          where the buying and selling transactions are
 *                          executed at different prices or on different terms
 *                          (requires a trade report with trade type indicator
 *                           R for each transaction)
 *                   ii) market maker is reporting all the legs of a riskless principal
 *                          transaction where the buying and selling transactions
 *                          are executed at different prices
 *                          (requires a trade report with trade type indicator R for each transaction) or
 *                  iii) market maker is reporting the onward leg of a riskless principal
 *                          transaction where the legs are executed at different prices,
 *                          and another market maker has submitted a trade report using
 *                          trade type indicator M for the first leg
 *                          (this requires a single trade report with trade type indicator R)
 *              )
 *      27 - RO (Transaction which resulted from the exercise of a traditional option
 *                  or a stock-settled covered warrant)
 *      28 - RT (Risk transaction in a SEATS security, (excluding AIM security)
 *                  reported by a market maker registered in that security)
 *      29 - SW (Transactions resulting from stock swap or a stock switch
 *                  (one report is required for each line of stock) )
 *      30 - T (If reporting a single protected transaction)
 *      31 - WN (Worked principal notification for a single order book security)
 *      32 - WT (Worked principal transaction (other than a portfolio transaction))
 */
public class Tag829EnuTrdSubType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum829TrdSubType dataValue;

    public final static Enum829TrdSubType TESTA_ENU_TRD_SUB_TYPE
            = Enum829TrdSubType.ACATS;
    public final static Enum829TrdSubType TESTB_ENU_TRD_SUB_TYPE
            = Enum829TrdSubType.LC;

    public Tag829EnuTrdSubType(Enum829TrdSubType dataValue) {
        setFixType(FIX44.FIX829_ENU_TRD_SUB_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        return this.dataValue.getID();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.getName();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.getDescription();
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
        Tag829EnuTrdSubType tagData;

        tagData = new Tag829EnuTrdSubType(TESTA_ENU_TRD_SUB_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag829EnuTrdSubType(TESTB_ENU_TRD_SUB_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
