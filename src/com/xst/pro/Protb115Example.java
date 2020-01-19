package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb115Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb115Example() {
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

        public Criteria andProtb115idIsNull() {
            addCriterion("PROTB115ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb115idIsNotNull() {
            addCriterion("PROTB115ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115idEqualTo(String value) {
            addCriterion("PROTB115ID =", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotEqualTo(String value) {
            addCriterion("PROTB115ID <>", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idGreaterThan(String value) {
            addCriterion("PROTB115ID >", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115ID >=", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idLessThan(String value) {
            addCriterion("PROTB115ID <", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idLessThanOrEqualTo(String value) {
            addCriterion("PROTB115ID <=", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idLike(String value) {
            addCriterion("PROTB115ID like", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotLike(String value) {
            addCriterion("PROTB115ID not like", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idIn(List<String> values) {
            addCriterion("PROTB115ID in", values, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotIn(List<String> values) {
            addCriterion("PROTB115ID not in", values, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idBetween(String value1, String value2) {
            addCriterion("PROTB115ID between", value1, value2, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotBetween(String value1, String value2) {
            addCriterion("PROTB115ID not between", value1, value2, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01IsNull() {
            addCriterion("PROTB115CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01IsNotNull() {
            addCriterion("PROTB115CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01EqualTo(String value) {
            addCriterion("PROTB115CD01 =", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01NotEqualTo(String value) {
            addCriterion("PROTB115CD01 <>", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01GreaterThan(String value) {
            addCriterion("PROTB115CD01 >", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115CD01 >=", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01LessThan(String value) {
            addCriterion("PROTB115CD01 <", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB115CD01 <=", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01Like(String value) {
            addCriterion("PROTB115CD01 like", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01NotLike(String value) {
            addCriterion("PROTB115CD01 not like", value, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01In(List<String> values) {
            addCriterion("PROTB115CD01 in", values, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01NotIn(List<String> values) {
            addCriterion("PROTB115CD01 not in", values, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01Between(String value1, String value2) {
            addCriterion("PROTB115CD01 between", value1, value2, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB115CD01 not between", value1, value2, "protb115cd01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00IsNull() {
            addCriterion("PROTB115CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00IsNotNull() {
            addCriterion("PROTB115CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00EqualTo(String value) {
            addCriterion("PROTB115CA00 =", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00NotEqualTo(String value) {
            addCriterion("PROTB115CA00 <>", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00GreaterThan(String value) {
            addCriterion("PROTB115CA00 >", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115CA00 >=", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00LessThan(String value) {
            addCriterion("PROTB115CA00 <", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB115CA00 <=", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00Like(String value) {
            addCriterion("PROTB115CA00 like", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00NotLike(String value) {
            addCriterion("PROTB115CA00 not like", value, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00In(List<String> values) {
            addCriterion("PROTB115CA00 in", values, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00NotIn(List<String> values) {
            addCriterion("PROTB115CA00 not in", values, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00Between(String value1, String value2) {
            addCriterion("PROTB115CA00 between", value1, value2, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB115CA00 not between", value1, value2, "protb115ca00");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01IsNull() {
            addCriterion("PROTB115CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01IsNotNull() {
            addCriterion("PROTB115CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01EqualTo(String value) {
            addCriterion("PROTB115CA01 =", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01NotEqualTo(String value) {
            addCriterion("PROTB115CA01 <>", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01GreaterThan(String value) {
            addCriterion("PROTB115CA01 >", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115CA01 >=", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01LessThan(String value) {
            addCriterion("PROTB115CA01 <", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01LessThanOrEqualTo(String value) {
            addCriterion("PROTB115CA01 <=", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01Like(String value) {
            addCriterion("PROTB115CA01 like", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01NotLike(String value) {
            addCriterion("PROTB115CA01 not like", value, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01In(List<String> values) {
            addCriterion("PROTB115CA01 in", values, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01NotIn(List<String> values) {
            addCriterion("PROTB115CA01 not in", values, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01Between(String value1, String value2) {
            addCriterion("PROTB115CA01 between", value1, value2, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca01NotBetween(String value1, String value2) {
            addCriterion("PROTB115CA01 not between", value1, value2, "protb115ca01");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02IsNull() {
            addCriterion("PROTB115CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02IsNotNull() {
            addCriterion("PROTB115CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02EqualTo(String value) {
            addCriterion("PROTB115CA02 =", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02NotEqualTo(String value) {
            addCriterion("PROTB115CA02 <>", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02GreaterThan(String value) {
            addCriterion("PROTB115CA02 >", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115CA02 >=", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02LessThan(String value) {
            addCriterion("PROTB115CA02 <", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02LessThanOrEqualTo(String value) {
            addCriterion("PROTB115CA02 <=", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02Like(String value) {
            addCriterion("PROTB115CA02 like", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02NotLike(String value) {
            addCriterion("PROTB115CA02 not like", value, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02In(List<String> values) {
            addCriterion("PROTB115CA02 in", values, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02NotIn(List<String> values) {
            addCriterion("PROTB115CA02 not in", values, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02Between(String value1, String value2) {
            addCriterion("PROTB115CA02 between", value1, value2, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115ca02NotBetween(String value1, String value2) {
            addCriterion("PROTB115CA02 not between", value1, value2, "protb115ca02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00IsNull() {
            addCriterion("PROTB115CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00IsNotNull() {
            addCriterion("PROTB115CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00EqualTo(Date value) {
            addCriterion("PROTB115CC00 =", value, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00NotEqualTo(Date value) {
            addCriterion("PROTB115CC00 <>", value, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00GreaterThan(Date value) {
            addCriterion("PROTB115CC00 >", value, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB115CC00 >=", value, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00LessThan(Date value) {
            addCriterion("PROTB115CC00 <", value, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB115CC00 <=", value, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00In(List<Date> values) {
            addCriterion("PROTB115CC00 in", values, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00NotIn(List<Date> values) {
            addCriterion("PROTB115CC00 not in", values, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00Between(Date value1, Date value2) {
            addCriterion("PROTB115CC00 between", value1, value2, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB115CC00 not between", value1, value2, "protb115cc00");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01IsNull() {
            addCriterion("PROTB115CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01IsNotNull() {
            addCriterion("PROTB115CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01EqualTo(String value) {
            addCriterion("PROTB115CC01 =", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01NotEqualTo(String value) {
            addCriterion("PROTB115CC01 <>", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01GreaterThan(String value) {
            addCriterion("PROTB115CC01 >", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115CC01 >=", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01LessThan(String value) {
            addCriterion("PROTB115CC01 <", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB115CC01 <=", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01Like(String value) {
            addCriterion("PROTB115CC01 like", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01NotLike(String value) {
            addCriterion("PROTB115CC01 not like", value, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01In(List<String> values) {
            addCriterion("PROTB115CC01 in", values, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01NotIn(List<String> values) {
            addCriterion("PROTB115CC01 not in", values, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01Between(String value1, String value2) {
            addCriterion("PROTB115CC01 between", value1, value2, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB115CC01 not between", value1, value2, "protb115cc01");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02IsNull() {
            addCriterion("PROTB115CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02IsNotNull() {
            addCriterion("PROTB115CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02EqualTo(Date value) {
            addCriterion("PROTB115CC02 =", value, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02NotEqualTo(Date value) {
            addCriterion("PROTB115CC02 <>", value, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02GreaterThan(Date value) {
            addCriterion("PROTB115CC02 >", value, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB115CC02 >=", value, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02LessThan(Date value) {
            addCriterion("PROTB115CC02 <", value, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB115CC02 <=", value, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02In(List<Date> values) {
            addCriterion("PROTB115CC02 in", values, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02NotIn(List<Date> values) {
            addCriterion("PROTB115CC02 not in", values, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02Between(Date value1, Date value2) {
            addCriterion("PROTB115CC02 between", value1, value2, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB115CC02 not between", value1, value2, "protb115cc02");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03IsNull() {
            addCriterion("PROTB115CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03IsNotNull() {
            addCriterion("PROTB115CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03EqualTo(String value) {
            addCriterion("PROTB115CC03 =", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03NotEqualTo(String value) {
            addCriterion("PROTB115CC03 <>", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03GreaterThan(String value) {
            addCriterion("PROTB115CC03 >", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115CC03 >=", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03LessThan(String value) {
            addCriterion("PROTB115CC03 <", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB115CC03 <=", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03Like(String value) {
            addCriterion("PROTB115CC03 like", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03NotLike(String value) {
            addCriterion("PROTB115CC03 not like", value, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03In(List<String> values) {
            addCriterion("PROTB115CC03 in", values, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03NotIn(List<String> values) {
            addCriterion("PROTB115CC03 not in", values, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03Between(String value1, String value2) {
            addCriterion("PROTB115CC03 between", value1, value2, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB115CC03 not between", value1, value2, "protb115cc03");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00IsNull() {
            addCriterion("PROTB115CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00IsNotNull() {
            addCriterion("PROTB115CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00EqualTo(String value) {
            addCriterion("PROTB115CD00 =", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00NotEqualTo(String value) {
            addCriterion("PROTB115CD00 <>", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00GreaterThan(String value) {
            addCriterion("PROTB115CD00 >", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115CD00 >=", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00LessThan(String value) {
            addCriterion("PROTB115CD00 <", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB115CD00 <=", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00Like(String value) {
            addCriterion("PROTB115CD00 like", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00NotLike(String value) {
            addCriterion("PROTB115CD00 not like", value, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00In(List<String> values) {
            addCriterion("PROTB115CD00 in", values, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00NotIn(List<String> values) {
            addCriterion("PROTB115CD00 not in", values, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00Between(String value1, String value2) {
            addCriterion("PROTB115CD00 between", value1, value2, "protb115cd00");
            return (Criteria) this;
        }

        public Criteria andProtb115cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB115CD00 not between", value1, value2, "protb115cd00");
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