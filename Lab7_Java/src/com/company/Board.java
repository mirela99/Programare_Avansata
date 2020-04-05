package com.company;


import java.util.List;

public class Board {
   List<Token> tokenList;

    public Board(List<Token> tokenList) {
        this.tokenList = tokenList;
    }

    public void setTokensList(List<Token> tokensList) {
        this.tokenList = tokenList;
    }

    public List<Token> getTokenList() {
        return (List<Token>)tokenList;
    }
    synchronized void removeToken(Token token)
    {
        tokenList.remove(token);
    }
}
