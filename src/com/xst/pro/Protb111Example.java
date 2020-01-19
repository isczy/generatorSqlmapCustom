package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb111Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb111Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProtb111idIsNull() {
            addCriterion("PROTB111ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb111idIsNotNull() {
            addCriterion("PROTB111ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111idEqualTo(String value) {
            addCriterion("PROTB111ID =", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idNotEqualTo(String value) {
            addCriterion("PROTB111ID <>", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idGreaterThan(String value) {
            addCriterion("PROTB111ID >", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111ID >=", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idLessThan(String value) {
            addCriterion("PROTB111ID <", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idLessThanOrEqualTo(String value) {
            addCriterion("PROTB111ID <=", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idLike(String value) {
            addCriterion("PROTB111ID like", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idNotLike(String value) {
            addCriterion("PROTB111ID not like", value, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idIn(List<String> values) {
            addCriterion("PROTB111ID in", values, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idNotIn(List<String> values) {
            addCriterion("PROTB111ID not in", values, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idBetween(String value1, String value2) {
            addCriterion("PROTB111ID between", value1, value2, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111idNotBetween(String value1, String value2) {
            addCriterion("PROTB111ID not between", value1, value2, "protb111id");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01IsNull() {
            addCriterion("PROTB111CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01IsNotNull() {
            addCriterion("PROTB111CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01EqualTo(String value) {
            addCriterion("PROTB111CD01 =", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01NotEqualTo(String value) {
            addCriterion("PROTB111CD01 <>", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01GreaterThan(String value) {
            addCriterion("PROTB111CD01 >", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CD01 >=", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01LessThan(String value) {
            addCriterion("PROTB111CD01 <", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CD01 <=", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01Like(String value) {
            addCriterion("PROTB111CD01 like", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01NotLike(String value) {
            addCriterion("PROTB111CD01 not like", value, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01In(List<String> values) {
            addCriterion("PROTB111CD01 in", values, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01NotIn(List<String> values) {
            addCriterion("PROTB111CD01 not in", values, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01Between(String value1, String value2) {
            addCriterion("PROTB111CD01 between", value1, value2, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andProtb111cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB111CD01 not between", value1, value2, "protb111cd01");
            return (Criteria) this;
        }

        public Criteria andCaltb003idIsNull() {
            addCriterion("CALTB003ID is null");
            return (Criteria) this;
        }

        public Criteria andCaltb003idIsNotNull() {
            addCriterion("CALTB003ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaltb003idEqualTo(String value) {
            addCriterion("CALTB003ID =", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idNotEqualTo(String value) {
            addCriterion("CALTB003ID <>", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idGreaterThan(String value) {
            addCriterion("CALTB003ID >", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idGreaterThanOrEqualTo(String value) {
            addCriterion("CALTB003ID >=", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idLessThan(String value) {
            addCriterion("CALTB003ID <", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idLessThanOrEqualTo(String value) {
            addCriterion("CALTB003ID <=", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idLike(String value) {
            addCriterion("CALTB003ID like", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idNotLike(String value) {
            addCriterion("CALTB003ID not like", value, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idIn(List<String> values) {
            addCriterion("CALTB003ID in", values, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idNotIn(List<String> values) {
            addCriterion("CALTB003ID not in", values, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idBetween(String value1, String value2) {
            addCriterion("CALTB003ID between", value1, value2, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andCaltb003idNotBetween(String value1, String value2) {
            addCriterion("CALTB003ID not between", value1, value2, "caltb003id");
            return (Criteria) this;
        }

        public Criteria andProtb108idIsNull() {
            addCriterion("PROTB108ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb108idIsNotNull() {
            addCriterion("PROTB108ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108idEqualTo(String value) {
            addCriterion("PROTB108ID =", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotEqualTo(String value) {
            addCriterion("PROTB108ID <>", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idGreaterThan(String value) {
            addCriterion("PROTB108ID >", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108ID >=", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idLessThan(String value) {
            addCriterion("PROTB108ID <", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idLessThanOrEqualTo(String value) {
            addCriterion("PROTB108ID <=", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idLike(String value) {
            addCriterion("PROTB108ID like", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotLike(String value) {
            addCriterion("PROTB108ID not like", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idIn(List<String> values) {
            addCriterion("PROTB108ID in", values, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotIn(List<String> values) {
            addCriterion("PROTB108ID not in", values, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idBetween(String value1, String value2) {
            addCriterion("PROTB108ID between", value1, value2, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotBetween(String value1, String value2) {
            addCriterion("PROTB108ID not between", value1, value2, "protb108id");
            return (Criteria) this;
        }

        public Criteria andSettb09idIsNull() {
            addCriterion("SETTB09ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb09idIsNotNull() {
            addCriterion("SETTB09ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb09idEqualTo(String value) {
            addCriterion("SETTB09ID =", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotEqualTo(String value) {
            addCriterion("SETTB09ID <>", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idGreaterThan(String value) {
            addCriterion("SETTB09ID >", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB09ID >=", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idLessThan(String value) {
            addCriterion("SETTB09ID <", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idLessThanOrEqualTo(String value) {
            addCriterion("SETTB09ID <=", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idLike(String value) {
            addCriterion("SETTB09ID like", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotLike(String value) {
            addCriterion("SETTB09ID not like", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idIn(List<String> values) {
            addCriterion("SETTB09ID in", values, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotIn(List<String> values) {
            addCriterion("SETTB09ID not in", values, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idBetween(String value1, String value2) {
            addCriterion("SETTB09ID between", value1, value2, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotBetween(String value1, String value2) {
            addCriterion("SETTB09ID not between", value1, value2, "settb09id");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00IsNull() {
            addCriterion("PROTB111CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00IsNotNull() {
            addCriterion("PROTB111CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00EqualTo(Date value) {
            addCriterion("PROTB111CA00 =", value, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00NotEqualTo(Date value) {
            addCriterion("PROTB111CA00 <>", value, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00GreaterThan(Date value) {
            addCriterion("PROTB111CA00 >", value, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB111CA00 >=", value, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00LessThan(Date value) {
            addCriterion("PROTB111CA00 <", value, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB111CA00 <=", value, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00In(List<Date> values) {
            addCriterion("PROTB111CA00 in", values, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00NotIn(List<Date> values) {
            addCriterion("PROTB111CA00 not in", values, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00Between(Date value1, Date value2) {
            addCriterion("PROTB111CA00 between", value1, value2, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB111CA00 not between", value1, value2, "protb111ca00");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01IsNull() {
            addCriterion("PROTB111CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01IsNotNull() {
            addCriterion("PROTB111CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01EqualTo(String value) {
            addCriterion("PROTB111CA01 =", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01NotEqualTo(String value) {
            addCriterion("PROTB111CA01 <>", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01GreaterThan(String value) {
            addCriterion("PROTB111CA01 >", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CA01 >=", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01LessThan(String value) {
            addCriterion("PROTB111CA01 <", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CA01 <=", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01Like(String value) {
            addCriterion("PROTB111CA01 like", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01NotLike(String value) {
            addCriterion("PROTB111CA01 not like", value, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01In(List<String> values) {
            addCriterion("PROTB111CA01 in", values, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01NotIn(List<String> values) {
            addCriterion("PROTB111CA01 not in", values, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01Between(String value1, String value2) {
            addCriterion("PROTB111CA01 between", value1, value2, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca01NotBetween(String value1, String value2) {
            addCriterion("PROTB111CA01 not between", value1, value2, "protb111ca01");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02IsNull() {
            addCriterion("PROTB111CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02IsNotNull() {
            addCriterion("PROTB111CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02EqualTo(Date value) {
            addCriterion("PROTB111CA02 =", value, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02NotEqualTo(Date value) {
            addCriterion("PROTB111CA02 <>", value, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02GreaterThan(Date value) {
            addCriterion("PROTB111CA02 >", value, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB111CA02 >=", value, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02LessThan(Date value) {
            addCriterion("PROTB111CA02 <", value, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB111CA02 <=", value, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02In(List<Date> values) {
            addCriterion("PROTB111CA02 in", values, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02NotIn(List<Date> values) {
            addCriterion("PROTB111CA02 not in", values, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02Between(Date value1, Date value2) {
            addCriterion("PROTB111CA02 between", value1, value2, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB111CA02 not between", value1, value2, "protb111ca02");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03IsNull() {
            addCriterion("PROTB111CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03IsNotNull() {
            addCriterion("PROTB111CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03EqualTo(Date value) {
            addCriterion("PROTB111CA03 =", value, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03NotEqualTo(Date value) {
            addCriterion("PROTB111CA03 <>", value, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03GreaterThan(Date value) {
            addCriterion("PROTB111CA03 >", value, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB111CA03 >=", value, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03LessThan(Date value) {
            addCriterion("PROTB111CA03 <", value, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03LessThanOrEqualTo(Date value) {
            addCriterion("PROTB111CA03 <=", value, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03In(List<Date> values) {
            addCriterion("PROTB111CA03 in", values, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03NotIn(List<Date> values) {
            addCriterion("PROTB111CA03 not in", values, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03Between(Date value1, Date value2) {
            addCriterion("PROTB111CA03 between", value1, value2, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca03NotBetween(Date value1, Date value2) {
            addCriterion("PROTB111CA03 not between", value1, value2, "protb111ca03");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04IsNull() {
            addCriterion("PROTB111CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04IsNotNull() {
            addCriterion("PROTB111CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04EqualTo(String value) {
            addCriterion("PROTB111CA04 =", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04NotEqualTo(String value) {
            addCriterion("PROTB111CA04 <>", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04GreaterThan(String value) {
            addCriterion("PROTB111CA04 >", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CA04 >=", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04LessThan(String value) {
            addCriterion("PROTB111CA04 <", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CA04 <=", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04Like(String value) {
            addCriterion("PROTB111CA04 like", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04NotLike(String value) {
            addCriterion("PROTB111CA04 not like", value, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04In(List<String> values) {
            addCriterion("PROTB111CA04 in", values, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04NotIn(List<String> values) {
            addCriterion("PROTB111CA04 not in", values, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04Between(String value1, String value2) {
            addCriterion("PROTB111CA04 between", value1, value2, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca04NotBetween(String value1, String value2) {
            addCriterion("PROTB111CA04 not between", value1, value2, "protb111ca04");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05IsNull() {
            addCriterion("PROTB111CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05IsNotNull() {
            addCriterion("PROTB111CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05EqualTo(String value) {
            addCriterion("PROTB111CA05 =", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05NotEqualTo(String value) {
            addCriterion("PROTB111CA05 <>", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05GreaterThan(String value) {
            addCriterion("PROTB111CA05 >", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CA05 >=", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05LessThan(String value) {
            addCriterion("PROTB111CA05 <", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CA05 <=", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05Like(String value) {
            addCriterion("PROTB111CA05 like", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05NotLike(String value) {
            addCriterion("PROTB111CA05 not like", value, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05In(List<String> values) {
            addCriterion("PROTB111CA05 in", values, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05NotIn(List<String> values) {
            addCriterion("PROTB111CA05 not in", values, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05Between(String value1, String value2) {
            addCriterion("PROTB111CA05 between", value1, value2, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca05NotBetween(String value1, String value2) {
            addCriterion("PROTB111CA05 not between", value1, value2, "protb111ca05");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06IsNull() {
            addCriterion("PROTB111CA06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06IsNotNull() {
            addCriterion("PROTB111CA06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06EqualTo(String value) {
            addCriterion("PROTB111CA06 =", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06NotEqualTo(String value) {
            addCriterion("PROTB111CA06 <>", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06GreaterThan(String value) {
            addCriterion("PROTB111CA06 >", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CA06 >=", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06LessThan(String value) {
            addCriterion("PROTB111CA06 <", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CA06 <=", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06Like(String value) {
            addCriterion("PROTB111CA06 like", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06NotLike(String value) {
            addCriterion("PROTB111CA06 not like", value, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06In(List<String> values) {
            addCriterion("PROTB111CA06 in", values, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06NotIn(List<String> values) {
            addCriterion("PROTB111CA06 not in", values, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06Between(String value1, String value2) {
            addCriterion("PROTB111CA06 between", value1, value2, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca06NotBetween(String value1, String value2) {
            addCriterion("PROTB111CA06 not between", value1, value2, "protb111ca06");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07IsNull() {
            addCriterion("PROTB111CA07 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07IsNotNull() {
            addCriterion("PROTB111CA07 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07EqualTo(String value) {
            addCriterion("PROTB111CA07 =", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07NotEqualTo(String value) {
            addCriterion("PROTB111CA07 <>", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07GreaterThan(String value) {
            addCriterion("PROTB111CA07 >", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CA07 >=", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07LessThan(String value) {
            addCriterion("PROTB111CA07 <", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CA07 <=", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07Like(String value) {
            addCriterion("PROTB111CA07 like", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07NotLike(String value) {
            addCriterion("PROTB111CA07 not like", value, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07In(List<String> values) {
            addCriterion("PROTB111CA07 in", values, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07NotIn(List<String> values) {
            addCriterion("PROTB111CA07 not in", values, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07Between(String value1, String value2) {
            addCriterion("PROTB111CA07 between", value1, value2, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111ca07NotBetween(String value1, String value2) {
            addCriterion("PROTB111CA07 not between", value1, value2, "protb111ca07");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00IsNull() {
            addCriterion("PROTB111CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00IsNotNull() {
            addCriterion("PROTB111CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00EqualTo(Date value) {
            addCriterion("PROTB111CC00 =", value, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00NotEqualTo(Date value) {
            addCriterion("PROTB111CC00 <>", value, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00GreaterThan(Date value) {
            addCriterion("PROTB111CC00 >", value, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB111CC00 >=", value, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00LessThan(Date value) {
            addCriterion("PROTB111CC00 <", value, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB111CC00 <=", value, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00In(List<Date> values) {
            addCriterion("PROTB111CC00 in", values, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00NotIn(List<Date> values) {
            addCriterion("PROTB111CC00 not in", values, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00Between(Date value1, Date value2) {
            addCriterion("PROTB111CC00 between", value1, value2, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB111CC00 not between", value1, value2, "protb111cc00");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01IsNull() {
            addCriterion("PROTB111CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01IsNotNull() {
            addCriterion("PROTB111CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01EqualTo(String value) {
            addCriterion("PROTB111CC01 =", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01NotEqualTo(String value) {
            addCriterion("PROTB111CC01 <>", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01GreaterThan(String value) {
            addCriterion("PROTB111CC01 >", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CC01 >=", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01LessThan(String value) {
            addCriterion("PROTB111CC01 <", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CC01 <=", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01Like(String value) {
            addCriterion("PROTB111CC01 like", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01NotLike(String value) {
            addCriterion("PROTB111CC01 not like", value, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01In(List<String> values) {
            addCriterion("PROTB111CC01 in", values, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01NotIn(List<String> values) {
            addCriterion("PROTB111CC01 not in", values, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01Between(String value1, String value2) {
            addCriterion("PROTB111CC01 between", value1, value2, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB111CC01 not between", value1, value2, "protb111cc01");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02IsNull() {
            addCriterion("PROTB111CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02IsNotNull() {
            addCriterion("PROTB111CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02EqualTo(Date value) {
            addCriterion("PROTB111CC02 =", value, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02NotEqualTo(Date value) {
            addCriterion("PROTB111CC02 <>", value, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02GreaterThan(Date value) {
            addCriterion("PROTB111CC02 >", value, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB111CC02 >=", value, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02LessThan(Date value) {
            addCriterion("PROTB111CC02 <", value, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB111CC02 <=", value, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02In(List<Date> values) {
            addCriterion("PROTB111CC02 in", values, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02NotIn(List<Date> values) {
            addCriterion("PROTB111CC02 not in", values, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02Between(Date value1, Date value2) {
            addCriterion("PROTB111CC02 between", value1, value2, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB111CC02 not between", value1, value2, "protb111cc02");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03IsNull() {
            addCriterion("PROTB111CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03IsNotNull() {
            addCriterion("PROTB111CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03EqualTo(String value) {
            addCriterion("PROTB111CC03 =", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03NotEqualTo(String value) {
            addCriterion("PROTB111CC03 <>", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03GreaterThan(String value) {
            addCriterion("PROTB111CC03 >", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CC03 >=", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03LessThan(String value) {
            addCriterion("PROTB111CC03 <", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CC03 <=", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03Like(String value) {
            addCriterion("PROTB111CC03 like", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03NotLike(String value) {
            addCriterion("PROTB111CC03 not like", value, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03In(List<String> values) {
            addCriterion("PROTB111CC03 in", values, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03NotIn(List<String> values) {
            addCriterion("PROTB111CC03 not in", values, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03Between(String value1, String value2) {
            addCriterion("PROTB111CC03 between", value1, value2, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB111CC03 not between", value1, value2, "protb111cc03");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00IsNull() {
            addCriterion("PROTB111CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00IsNotNull() {
            addCriterion("PROTB111CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00EqualTo(String value) {
            addCriterion("PROTB111CD00 =", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00NotEqualTo(String value) {
            addCriterion("PROTB111CD00 <>", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00GreaterThan(String value) {
            addCriterion("PROTB111CD00 >", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB111CD00 >=", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00LessThan(String value) {
            addCriterion("PROTB111CD00 <", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB111CD00 <=", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00Like(String value) {
            addCriterion("PROTB111CD00 like", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00NotLike(String value) {
            addCriterion("PROTB111CD00 not like", value, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00In(List<String> values) {
            addCriterion("PROTB111CD00 in", values, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00NotIn(List<String> values) {
            addCriterion("PROTB111CD00 not in", values, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00Between(String value1, String value2) {
            addCriterion("PROTB111CD00 between", value1, value2, "protb111cd00");
            return (Criteria) this;
        }

        public Criteria andProtb111cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB111CD00 not between", value1, value2, "protb111cd00");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}