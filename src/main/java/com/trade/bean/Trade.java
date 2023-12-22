/*
 * Copyright © 2023 Empowered Systems. All rights reserved. Proprietary and confidential information of Empowered Systems and its
 * affiliated companies. Disclosure, use, or reproduction without the written authorisation of Empowered Systems is prohibited.
 * : Trade.java 100473 12/15/2023 4:25 PM:50Z MasoodFarooqi $
 */

package com.trade.bean;

public class Trade
{
	public Long getTradeId()
	{
		return tradeId;
	}

	public void setTradeId(Long tradeId)
	{
		this.tradeId = tradeId;
	}

	public String getStatus()
	{
		return Status;
	}

	public void setStatus(String status)
	{
		Status = status;
	}

	public Trade(Long tradeId, String status)
	{
		this.tradeId = tradeId;
		Status = status;
	}

	Long tradeId;
	String Status;
}
