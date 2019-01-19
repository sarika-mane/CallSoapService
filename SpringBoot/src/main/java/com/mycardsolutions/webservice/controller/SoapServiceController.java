package com.mycardsolutions.webservice.controller;

import java.util.HashMap;
import java.util.Map;

import com.mycardsolutions.webservice.soapdto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycardsolutions.webservice.pojo.Customer;
import com.mycardsolutions.webservice.service.SoapService;

@RestController
@RequestMapping(path = "/")

public class SoapServiceController {

    private static Logger logger = LoggerFactory.getLogger(SoapServiceController.class);

    @Autowired
    public SoapService soapService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> home() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        resultMap.put("Data", "Hello World");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
    }

    @RequestMapping(path = "/CreateCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> saveCustomer(@RequestBody Customer customerNo) { //@RequestBody
        logger.info("Input Parameters: " + customerNo);
        soapService.saveCustomer(customerNo.getCustomer_no());
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/CreateCard", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> createCard(@RequestBody Customer customerNo) { //@RequestBody
        logger.info("Input Parameters: " + customerNo);
        soapService.createCard(customerNo.getCustomer_no());
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/SaveDebitBankAcc", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> saveDebitBankAcc(@RequestBody Customer customerNo) { //@RequestBody
        logger.info("Input Parameters: " + customerNo);
        soapService.saveDebitBankAcc(customerNo.getCustomer_no());
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetDebitBankAcc/{cardNo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getDebitBankAcc(@PathVariable("cardNo") String cardNo) { //@RequestBody
        logger.info("Input Parameters: " + cardNo);
        soapService.getDebitBankAcc(cardNo);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/DeleteDbtBnkAcc/{cardNo}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> deleteDebitBankAcc(@PathVariable("cardNo") String cardNo) { //@RequestBody
        logger.info("Input Parameters: " + cardNo);
        soapService.deleteDebitBankAcc(cardNo);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }


    @RequestMapping(path = "/GetCardInfo/{cardNo}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getCardInfo(@PathVariable String cardNo) { //@RequestBody
        logger.info("Input Parameters: " + cardNo);
        soapService.getCardInfo(cardNo);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetCardAllBalanceAndLimit/{cardNo}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getCardAllBalanceAndLimit(@PathVariable String cardNo) { //@RequestBody
        logger.info("Input Parameters: " + cardNo);
        soapService.getCardAllBalanceAndLimit(cardNo);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetCustomer/{customerNo}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getCustomer(@PathVariable String customerNo) { //@RequestBody
        logger.info("Input Parameters: " + customerNo);
        soapService.getCustomer(customerNo);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetCustomerCardInfo/{cardNo}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getCustomerCardInfo(@PathVariable String cardNo) { //@RequestBody
        logger.info("Input Parameters: " + cardNo);
        soapService.getCustomerCardInfo(cardNo);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetCardStatus", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getCardStatus() { //@RequestBody
        //logger.info("Input Parameters: " + cardNo);
        soapService.getCardStatus();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetProducts", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getProducts() { //@RequestBody
        //logger.info("Input Parameters: " + cardNo);
        soapService.getProducts();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetTxnDef", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getTxnDef() { //@RequestBody
        //logger.info("Input Parameters: " + cardNo);
        soapService.getTxnDef();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/UpdateCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getProducts(@RequestBody Customer customer) { //@RequestBody
        logger.info("Input Parameters: " + customer);
        soapService.updateCustomer(customer.getCustomer_no());
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    @RequestMapping(path = "/GetLogoCodes", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getLogoCodes() { //@RequestBody
        //logger.info("Input Parameters: " + cardNo);
        soapService.getLogoCodes();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", "OK");
        return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

    }

    /**
     * kemblekaran
     *
     * @param getCityList
     * @return GetCityListResponse object which contains city list with status code
     */
    @RequestMapping(path = "/GetCityList", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public GetCityListResponse getCities(@RequestBody GetCityList getCityList) {
        return soapService.getCities(getCityList);
    }

    /**
     * throws error => Unable to handle request without a valid action parameter. Please supply a valid soap action.
     * kemblekaran
     *
     * @param cardStatControlRsp
     * @return CardStatControlRsp
     */
    @RequestMapping(path = "/CardStatControl", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CardStatControlRspResponse getCardStatusControl(@RequestBody CardStatControlRspResponse cardStatControlRsp) {
        return soapService.getCardStatusControl(cardStatControlRsp);
    }

    /**
     * returns response as ERROR => Card Number Not Found
     * kemblekaran
     *
     * @param cardVerificationResp
     * @return if card is verified or not
     */
    @RequestMapping(path = "/CardVerification", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean cardVerfication(@RequestBody CardVerificationResp cardVerificationResp) {
        return soapService.isCardVerified(cardVerificationResp);
    }
}
