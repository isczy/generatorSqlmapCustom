package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Protb201Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb201Example() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProtb201idIsNull() {
            addCriterion("PROTB201ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb201idIsNotNull() {
            addCriterion("PROTB201ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201idEqualTo(String value) {
            addCriterion("PROTB201ID =", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idNotEqualTo(String value) {
            addCriterion("PROTB201ID <>", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idGreaterThan(String value) {
            addCriterion("PROTB201ID >", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201ID >=", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idLessThan(String value) {
            addCriterion("PROTB201ID <", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idLessThanOrEqualTo(String value) {
            addCriterion("PROTB201ID <=", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idLike(String value) {
            addCriterion("PROTB201ID like", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idNotLike(String value) {
            addCriterion("PROTB201ID not like", value, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idIn(List<String> values) {
            addCriterion("PROTB201ID in", values, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idNotIn(List<String> values) {
            addCriterion("PROTB201ID not in", values, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idBetween(String value1, String value2) {
            addCriterion("PROTB201ID between", value1, value2, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201idNotBetween(String value1, String value2) {
            addCriterion("PROTB201ID not between", value1, value2, "protb201id");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01IsNull() {
            addCriterion("PROTB201CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01IsNotNull() {
            addCriterion("PROTB201CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01EqualTo(String value) {
            addCriterion("PROTB201CD01 =", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01NotEqualTo(String value) {
            addCriterion("PROTB201CD01 <>", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01GreaterThan(String value) {
            addCriterion("PROTB201CD01 >", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201CD01 >=", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01LessThan(String value) {
            addCriterion("PROTB201CD01 <", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB201CD01 <=", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01Like(String value) {
            addCriterion("PROTB201CD01 like", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01NotLike(String value) {
            addCriterion("PROTB201CD01 not like", value, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01In(List<String> values) {
            addCriterion("PROTB201CD01 in", values, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01NotIn(List<String> values) {
            addCriterion("PROTB201CD01 not in", values, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01Between(String value1, String value2) {
            addCriterion("PROTB201CD01 between", value1, value2, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andProtb201cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB201CD01 not between", value1, value2, "protb201cd01");
            return (Criteria) this;
        }

        public Criteria andSettb03idIsNull() {
            addCriterion("SETTB03ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb03idIsNotNull() {
            addCriterion("SETTB03ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb03idEqualTo(String value) {
            addCriterion("SETTB03ID =", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotEqualTo(String value) {
            addCriterion("SETTB03ID <>", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idGreaterThan(String value) {
            addCriterion("SETTB03ID >", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB03ID >=", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLessThan(String value) {
            addCriterion("SETTB03ID <", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLessThanOrEqualTo(String value) {
            addCriterion("SETTB03ID <=", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLike(String value) {
            addCriterion("SETTB03ID like", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotLike(String value) {
            addCriterion("SETTB03ID not like", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idIn(List<String> values) {
            addCriterion("SETTB03ID in", values, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotIn(List<String> values) {
            addCriterion("SETTB03ID not in", values, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idBetween(String value1, String value2) {
            addCriterion("SETTB03ID between", value1, value2, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotBetween(String value1, String value2) {
            addCriterion("SETTB03ID not between", value1, value2, "settb03id");
            return (Criteria) this;
        }

        public Criteria andProtb102idIsNull() {
            addCriterion("PROTB102ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb102idIsNotNull() {
            addCriterion("PROTB102ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102idEqualTo(String value) {
            addCriterion("PROTB102ID =", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotEqualTo(String value) {
            addCriterion("PROTB102ID <>", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idGreaterThan(String value) {
            addCriterion("PROTB102ID >", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102ID >=", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLessThan(String value) {
            addCriterion("PROTB102ID <", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLessThanOrEqualTo(String value) {
            addCriterion("PROTB102ID <=", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLike(String value) {
            addCriterion("PROTB102ID like", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotLike(String value) {
            addCriterion("PROTB102ID not like", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idIn(List<String> values) {
            addCriterion("PROTB102ID in", values, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotIn(List<String> values) {
            addCriterion("PROTB102ID not in", values, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idBetween(String value1, String value2) {
            addCriterion("PROTB102ID between", value1, value2, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotBetween(String value1, String value2) {
            addCriterion("PROTB102ID not between", value1, value2, "protb102id");
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

        public Criteria andProtb201ca00IsNull() {
            addCriterion("PROTB201CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00IsNotNull() {
            addCriterion("PROTB201CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00EqualTo(Date value) {
            addCriterionForJDBCDate("PROTB201CA00 =", value, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00NotEqualTo(Date value) {
            addCriterionForJDBCDate("PROTB201CA00 <>", value, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00GreaterThan(Date value) {
            addCriterionForJDBCDate("PROTB201CA00 >", value, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROTB201CA00 >=", value, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00LessThan(Date value) {
            addCriterionForJDBCDate("PROTB201CA00 <", value, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROTB201CA00 <=", value, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00In(List<Date> values) {
            addCriterionForJDBCDate("PROTB201CA00 in", values, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00NotIn(List<Date> values) {
            addCriterionForJDBCDate("PROTB201CA00 not in", values, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00Between(Date value1, Date value2) {
            addCriterionForJDBCDate("PROTB201CA00 between", value1, value2, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca00NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROTB201CA00 not between", value1, value2, "protb201ca00");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01IsNull() {
            addCriterion("PROTB201CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01IsNotNull() {
            addCriterion("PROTB201CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01EqualTo(Date value) {
            addCriterion("PROTB201CA01 =", value, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01NotEqualTo(Date value) {
            addCriterion("PROTB201CA01 <>", value, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01GreaterThan(Date value) {
            addCriterion("PROTB201CA01 >", value, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB201CA01 >=", value, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01LessThan(Date value) {
            addCriterion("PROTB201CA01 <", value, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB201CA01 <=", value, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01In(List<Date> values) {
            addCriterion("PROTB201CA01 in", values, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01NotIn(List<Date> values) {
            addCriterion("PROTB201CA01 not in", values, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01Between(Date value1, Date value2) {
            addCriterion("PROTB201CA01 between", value1, value2, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB201CA01 not between", value1, value2, "protb201ca01");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02IsNull() {
            addCriterion("PROTB201CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02IsNotNull() {
            addCriterion("PROTB201CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02EqualTo(Date value) {
            addCriterion("PROTB201CA02 =", value, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02NotEqualTo(Date value) {
            addCriterion("PROTB201CA02 <>", value, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02GreaterThan(Date value) {
            addCriterion("PROTB201CA02 >", value, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB201CA02 >=", value, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02LessThan(Date value) {
            addCriterion("PROTB201CA02 <", value, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB201CA02 <=", value, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02In(List<Date> values) {
            addCriterion("PROTB201CA02 in", values, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02NotIn(List<Date> values) {
            addCriterion("PROTB201CA02 not in", values, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02Between(Date value1, Date value2) {
            addCriterion("PROTB201CA02 between", value1, value2, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB201CA02 not between", value1, value2, "protb201ca02");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03IsNull() {
            addCriterion("PROTB201CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03IsNotNull() {
            addCriterion("PROTB201CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03EqualTo(Double value) {
            addCriterion("PROTB201CA03 =", value, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03NotEqualTo(Double value) {
            addCriterion("PROTB201CA03 <>", value, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03GreaterThan(Double value) {
            addCriterion("PROTB201CA03 >", value, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB201CA03 >=", value, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03LessThan(Double value) {
            addCriterion("PROTB201CA03 <", value, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03LessThanOrEqualTo(Double value) {
            addCriterion("PROTB201CA03 <=", value, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03In(List<Double> values) {
            addCriterion("PROTB201CA03 in", values, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03NotIn(List<Double> values) {
            addCriterion("PROTB201CA03 not in", values, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03Between(Double value1, Double value2) {
            addCriterion("PROTB201CA03 between", value1, value2, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca03NotBetween(Double value1, Double value2) {
            addCriterion("PROTB201CA03 not between", value1, value2, "protb201ca03");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04IsNull() {
            addCriterion("PROTB201CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04IsNotNull() {
            addCriterion("PROTB201CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04EqualTo(Integer value) {
            addCriterion("PROTB201CA04 =", value, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04NotEqualTo(Integer value) {
            addCriterion("PROTB201CA04 <>", value, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04GreaterThan(Integer value) {
            addCriterion("PROTB201CA04 >", value, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB201CA04 >=", value, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04LessThan(Integer value) {
            addCriterion("PROTB201CA04 <", value, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB201CA04 <=", value, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04In(List<Integer> values) {
            addCriterion("PROTB201CA04 in", values, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04NotIn(List<Integer> values) {
            addCriterion("PROTB201CA04 not in", values, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04Between(Integer value1, Integer value2) {
            addCriterion("PROTB201CA04 between", value1, value2, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca04NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB201CA04 not between", value1, value2, "protb201ca04");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05IsNull() {
            addCriterion("PROTB201CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05IsNotNull() {
            addCriterion("PROTB201CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05EqualTo(String value) {
            addCriterion("PROTB201CA05 =", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05NotEqualTo(String value) {
            addCriterion("PROTB201CA05 <>", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05GreaterThan(String value) {
            addCriterion("PROTB201CA05 >", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201CA05 >=", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05LessThan(String value) {
            addCriterion("PROTB201CA05 <", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05LessThanOrEqualTo(String value) {
            addCriterion("PROTB201CA05 <=", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05Like(String value) {
            addCriterion("PROTB201CA05 like", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05NotLike(String value) {
            addCriterion("PROTB201CA05 not like", value, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05In(List<String> values) {
            addCriterion("PROTB201CA05 in", values, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05NotIn(List<String> values) {
            addCriterion("PROTB201CA05 not in", values, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05Between(String value1, String value2) {
            addCriterion("PROTB201CA05 between", value1, value2, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca05NotBetween(String value1, String value2) {
            addCriterion("PROTB201CA05 not between", value1, value2, "protb201ca05");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06IsNull() {
            addCriterion("PROTB201CA06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06IsNotNull() {
            addCriterion("PROTB201CA06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06EqualTo(String value) {
            addCriterion("PROTB201CA06 =", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06NotEqualTo(String value) {
            addCriterion("PROTB201CA06 <>", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06GreaterThan(String value) {
            addCriterion("PROTB201CA06 >", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201CA06 >=", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06LessThan(String value) {
            addCriterion("PROTB201CA06 <", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06LessThanOrEqualTo(String value) {
            addCriterion("PROTB201CA06 <=", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06Like(String value) {
            addCriterion("PROTB201CA06 like", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06NotLike(String value) {
            addCriterion("PROTB201CA06 not like", value, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06In(List<String> values) {
            addCriterion("PROTB201CA06 in", values, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06NotIn(List<String> values) {
            addCriterion("PROTB201CA06 not in", values, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06Between(String value1, String value2) {
            addCriterion("PROTB201CA06 between", value1, value2, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca06NotBetween(String value1, String value2) {
            addCriterion("PROTB201CA06 not between", value1, value2, "protb201ca06");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07IsNull() {
            addCriterion("PROTB201CA07 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07IsNotNull() {
            addCriterion("PROTB201CA07 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07EqualTo(String value) {
            addCriterion("PROTB201CA07 =", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07NotEqualTo(String value) {
            addCriterion("PROTB201CA07 <>", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07GreaterThan(String value) {
            addCriterion("PROTB201CA07 >", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201CA07 >=", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07LessThan(String value) {
            addCriterion("PROTB201CA07 <", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07LessThanOrEqualTo(String value) {
            addCriterion("PROTB201CA07 <=", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07Like(String value) {
            addCriterion("PROTB201CA07 like", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07NotLike(String value) {
            addCriterion("PROTB201CA07 not like", value, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07In(List<String> values) {
            addCriterion("PROTB201CA07 in", values, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07NotIn(List<String> values) {
            addCriterion("PROTB201CA07 not in", values, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07Between(String value1, String value2) {
            addCriterion("PROTB201CA07 between", value1, value2, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201ca07NotBetween(String value1, String value2) {
            addCriterion("PROTB201CA07 not between", value1, value2, "protb201ca07");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00IsNull() {
            addCriterion("PROTB201CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00IsNotNull() {
            addCriterion("PROTB201CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00EqualTo(Date value) {
            addCriterion("PROTB201CC00 =", value, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00NotEqualTo(Date value) {
            addCriterion("PROTB201CC00 <>", value, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00GreaterThan(Date value) {
            addCriterion("PROTB201CC00 >", value, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB201CC00 >=", value, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00LessThan(Date value) {
            addCriterion("PROTB201CC00 <", value, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB201CC00 <=", value, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00In(List<Date> values) {
            addCriterion("PROTB201CC00 in", values, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00NotIn(List<Date> values) {
            addCriterion("PROTB201CC00 not in", values, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00Between(Date value1, Date value2) {
            addCriterion("PROTB201CC00 between", value1, value2, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB201CC00 not between", value1, value2, "protb201cc00");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01IsNull() {
            addCriterion("PROTB201CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01IsNotNull() {
            addCriterion("PROTB201CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01EqualTo(String value) {
            addCriterion("PROTB201CC01 =", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01NotEqualTo(String value) {
            addCriterion("PROTB201CC01 <>", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01GreaterThan(String value) {
            addCriterion("PROTB201CC01 >", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201CC01 >=", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01LessThan(String value) {
            addCriterion("PROTB201CC01 <", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB201CC01 <=", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01Like(String value) {
            addCriterion("PROTB201CC01 like", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01NotLike(String value) {
            addCriterion("PROTB201CC01 not like", value, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01In(List<String> values) {
            addCriterion("PROTB201CC01 in", values, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01NotIn(List<String> values) {
            addCriterion("PROTB201CC01 not in", values, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01Between(String value1, String value2) {
            addCriterion("PROTB201CC01 between", value1, value2, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB201CC01 not between", value1, value2, "protb201cc01");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02IsNull() {
            addCriterion("PROTB201CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02IsNotNull() {
            addCriterion("PROTB201CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02EqualTo(Date value) {
            addCriterion("PROTB201CC02 =", value, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02NotEqualTo(Date value) {
            addCriterion("PROTB201CC02 <>", value, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02GreaterThan(Date value) {
            addCriterion("PROTB201CC02 >", value, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB201CC02 >=", value, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02LessThan(Date value) {
            addCriterion("PROTB201CC02 <", value, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB201CC02 <=", value, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02In(List<Date> values) {
            addCriterion("PROTB201CC02 in", values, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02NotIn(List<Date> values) {
            addCriterion("PROTB201CC02 not in", values, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02Between(Date value1, Date value2) {
            addCriterion("PROTB201CC02 between", value1, value2, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB201CC02 not between", value1, value2, "protb201cc02");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03IsNull() {
            addCriterion("PROTB201CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03IsNotNull() {
            addCriterion("PROTB201CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03EqualTo(String value) {
            addCriterion("PROTB201CC03 =", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03NotEqualTo(String value) {
            addCriterion("PROTB201CC03 <>", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03GreaterThan(String value) {
            addCriterion("PROTB201CC03 >", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201CC03 >=", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03LessThan(String value) {
            addCriterion("PROTB201CC03 <", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB201CC03 <=", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03Like(String value) {
            addCriterion("PROTB201CC03 like", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03NotLike(String value) {
            addCriterion("PROTB201CC03 not like", value, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03In(List<String> values) {
            addCriterion("PROTB201CC03 in", values, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03NotIn(List<String> values) {
            addCriterion("PROTB201CC03 not in", values, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03Between(String value1, String value2) {
            addCriterion("PROTB201CC03 between", value1, value2, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB201CC03 not between", value1, value2, "protb201cc03");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00IsNull() {
            addCriterion("PROTB201CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00IsNotNull() {
            addCriterion("PROTB201CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00EqualTo(String value) {
            addCriterion("PROTB201CD00 =", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00NotEqualTo(String value) {
            addCriterion("PROTB201CD00 <>", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00GreaterThan(String value) {
            addCriterion("PROTB201CD00 >", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB201CD00 >=", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00LessThan(String value) {
            addCriterion("PROTB201CD00 <", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB201CD00 <=", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00Like(String value) {
            addCriterion("PROTB201CD00 like", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00NotLike(String value) {
            addCriterion("PROTB201CD00 not like", value, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00In(List<String> values) {
            addCriterion("PROTB201CD00 in", values, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00NotIn(List<String> values) {
            addCriterion("PROTB201CD00 not in", values, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00Between(String value1, String value2) {
            addCriterion("PROTB201CD00 between", value1, value2, "protb201cd00");
            return (Criteria) this;
        }

        public Criteria andProtb201cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB201CD00 not between", value1, value2, "protb201cd00");
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