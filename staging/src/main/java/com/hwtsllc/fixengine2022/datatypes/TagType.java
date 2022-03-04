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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TagType implements FixTagValuePairString, LogStringVerbose {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXType fixType;
    private final String dataValue;

    public TagType(final FIXType fixtype, String dataValue) {
        this.fixType = fixtype;
        this.dataValue = dataValue;
    }

    public String getFIXTypeName() {
        return fixType.getFIXTypeName();
    }
    public String getFIXName() {
        return fixType.getFIXName();
    }
    public int getFIXNumber() {
        return fixType.getFIXNumber();
    }
    public String getFIXDescription() {
        return fixType.getFIXDescription();
    }
    public String getDataValue() {
        return this.dataValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("=[")
                .append(getFIXTypeName())
                .append(",")
                .append(getFIXName())
                .append(",")
                .append(getFIXNumber())
                .append(",")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    @Override
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tFIXTypeName[")
                .append(getFIXTypeName())
                .append("]")
                .append("\n\tFIXNumber[")
                .append(getFIXNumber())
                .append("]")
                .append("\n\tFIXName[")
                .append(getFIXName())
                .append("]")
                .append("\n\tFIXDescription[")
                .append(getFIXDescription())
                .append("]")
                .append("\n\tDataValue[")
                .append(getDataValue())
                .append("]");
        return sb.toString();
    }
    @Override
    public String toFixTagValuePairString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFIXNumber())
                .append("=")
                .append(getDataValue());
        return sb.toString();
    }

    /*
     *
     */
    public static void main(String[] args) {

        TagType tag140PrevClosePx = new TagType(FIXType.FIX140_PREV_CLOSE_PX,"10.23");
        System.out.println("t140.1:"+tag140PrevClosePx);
        System.out.println("t140.2.verbose:"+tag140PrevClosePx.toLogStringVerbose());
        System.out.println("t140.7.FixString:"+tag140PrevClosePx.toFixTagValuePairString());

        TagType tag147Subject = new TagType(FIXType.SUBJECT,"This Is A Test Subject String");
        System.out.println("t147.1:"+tag147Subject);
        System.out.println("t147.2.verbose:"+tag147Subject.toLogStringVerbose());
        System.out.println("t147.7.FixString:"+tag147Subject.toFixTagValuePairString());

        TagType tag460Product = new TagType(FIXType.PRODUCT,"Widgets are Us!");
        System.out.println("t147.1:"+tag460Product);
        System.out.println("t147.2.verbose:"+tag460Product.toLogStringVerbose());
        System.out.println("t147.7.FixString:"+tag460Product.toFixTagValuePairString());

        TagType tag730SettlPrice = new TagType(FIXType.SETTL_PRICE,"23.74");
        System.out.println("t147.1:"+tag730SettlPrice);
        System.out.println("t147.2.verbose:"+tag730SettlPrice.toLogStringVerbose());
        System.out.println("t147.7.FixString:"+tag730SettlPrice.toFixTagValuePairString());

        TagType tag947StrikeCurrency = new TagType(FIXType.STRIKE_CURRENCY,"USD");
        System.out.println("t147.1:"+tag947StrikeCurrency);
        System.out.println("t147.2.verbose:"+tag947StrikeCurrency.toLogStringVerbose());
        System.out.println("t147.7.FixString:"+tag947StrikeCurrency.toFixTagValuePairString());

        TagType tag1020TradeVolume = new TagType(FIXType.TRADE_VOLUME,"1000000");
        System.out.println("t147.1:"+tag1020TradeVolume);
        System.out.println("t147.2.verbose:"+tag1020TradeVolume.toLogStringVerbose());
        System.out.println("t147.7.FixString:"+tag1020TradeVolume.toFixTagValuePairString());

    }

}
