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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * SeqNumType is a wrapper class for any SeqNumType field
 * Initially it will be an int.
 */
public class SeqNumType {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private int seqNum;

    public SeqNumType(final int seqNum) {
        this.seqNum = seqNum;
    }

    public long getSeqNumValue() {
        return seqNum;
    }
    public void setSeqNumValue(final int seqNum)  {
        this.seqNum = seqNum;
    }
    public void incrementSeqNumValue()  {
        this.seqNum++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSeqNumValue());
        return sb.toString();
    }
    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        SeqNumType seqNum = new SeqNumType(12345);
        System.out.println(seqNum);
        seqNum.setSeqNumValue(3456);
        System.out.println(seqNum);
        seqNum.incrementSeqNumValue();
        System.out.println(seqNum);
    }
}
