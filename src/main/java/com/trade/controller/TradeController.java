package com.trade.controller;

import com.trade.bean.Trade;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trade")
public class TradeController
{
	@PostMapping("/{tradeId}")
	public ResponseEntity<Trade> createTrade(@PathVariable Long tradeId)
	{
		String message =  "TODO: create new trade record with id: " + tradeId ;
		return ResponseEntity.status(HttpStatus.OK).body(new Trade(tradeId, message));
	}

	@GetMapping("/{tradeId}")
	public ResponseEntity<Trade> getTradeById(@PathVariable Long tradeId)
	{
		String message = "TODO: find the tradeId and return the record of id :  " + tradeId;
		return  ResponseEntity.status(HttpStatus.OK).body(new Trade(tradeId, message));
	}

	@GetMapping("/list")
	public ResponseEntity<String> getAllTrade()
	{
		return new ResponseEntity<>("TODO: A list of all trade", HttpStatus.OK);
	}

	@PutMapping("/{tradeId}")
	public ResponseEntity<String> updateTradeById(@PathVariable Long tradeId)
	{
		String message =   String.format("TODO: find the trade Id \" %d \" and UPDATE its record.", tradeId);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@DeleteMapping("/{tradeId}")
	public ResponseEntity<String> removeTradeById(@PathVariable Long tradeId)
	{
		String message =  String.format("TODO: find the trade Id \" %d \" and DELETE its record.", tradeId);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

}
