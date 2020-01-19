package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb103Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb103Example() {
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

        public Criteria andProtb103idIsNull() {
            addCriterion("PROTB103ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb103idIsNotNull() {
            addCriterion("PROTB103ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb103idEqualTo(String value) {
            addCriterion("PROTB103ID =", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idNotEqualTo(String value) {
            addCriterion("PROTB103ID <>", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idGreaterThan(String value) {
            addCriterion("PROTB103ID >", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB103ID >=", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idLessThan(String value) {
            addCriterion("PROTB103ID <", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idLessThanOrEqualTo(String value) {
            addCriterion("PROTB103ID <=", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idLike(String value) {
            addCriterion("PROTB103ID like", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idNotLike(String value) {
            addCriterion("PROTB103ID not like", value, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idIn(List<String> values) {
            addCriterion("PROTB103ID in", values, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idNotIn(List<String> values) {
            addCriterion("PROTB103ID not in", values, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idBetween(String value1, String value2) {
            addCriterion("PROTB103ID between", value1, value2, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103idNotBetween(String value1, String value2) {
            addCriterion("PROTB103ID not between", value1, value2, "protb103id");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01IsNull() {
            addCriterion("PROTB103CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01IsNotNull() {
            addCriterion("PROTB103CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01EqualTo(String value) {
            addCriterion("PROTB103CD01 =", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01NotEqualTo(String value) {
            addCriterion("PROTB103CD01 <>", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01GreaterThan(String value) {
            addCriterion("PROTB103CD01 >", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB103CD01 >=", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01LessThan(String value) {
            addCriterion("PROTB103CD01 <", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB103CD01 <=", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01Like(String value) {
            addCriterion("PROTB103CD01 like", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01NotLike(String value) {
            addCriterion("PROTB103CD01 not like", value, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01In(List<String> values) {
            addCriterion("PROTB103CD01 in", values, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01NotIn(List<String> values) {
            addCriterion("PROTB103CD01 not in", values, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01Between(String value1, String value2) {
            addCriterion("PROTB103CD01 between", value1, value2, "protb103cd01");
            return (Criteria) this;
        }

        public Criteria andProtb103cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB103CD01 not between", value1, value2, "protb103cd01");
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

        public Criteria andProtb103cc00IsNull() {
            addCriterion("PROTB103CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00IsNotNull() {
            addCriterion("PROTB103CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00EqualTo(Date value) {
            addCriterion("PROTB103CC00 =", value, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00NotEqualTo(Date value) {
            addCriterion("PROTB103CC00 <>", value, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00GreaterThan(Date value) {
            addCriterion("PROTB103CC00 >", value, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB103CC00 >=", value, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00LessThan(Date value) {
            addCriterion("PROTB103CC00 <", value, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB103CC00 <=", value, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00In(List<Date> values) {
            addCriterion("PROTB103CC00 in", values, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00NotIn(List<Date> values) {
            addCriterion("PROTB103CC00 not in", values, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00Between(Date value1, Date value2) {
            addCriterion("PROTB103CC00 between", value1, value2, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB103CC00 not between", value1, value2, "protb103cc00");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01IsNull() {
            addCriterion("PROTB103CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01IsNotNull() {
            addCriterion("PROTB103CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01EqualTo(String value) {
            addCriterion("PROTB103CC01 =", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01NotEqualTo(String value) {
            addCriterion("PROTB103CC01 <>", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01GreaterThan(String value) {
            addCriterion("PROTB103CC01 >", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB103CC01 >=", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01LessThan(String value) {
            addCriterion("PROTB103CC01 <", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB103CC01 <=", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01Like(String value) {
            addCriterion("PROTB103CC01 like", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01NotLike(String value) {
            addCriterion("PROTB103CC01 not like", value, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01In(List<String> values) {
            addCriterion("PROTB103CC01 in", values, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01NotIn(List<String> values) {
            addCriterion("PROTB103CC01 not in", values, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01Between(String value1, String value2) {
            addCriterion("PROTB103CC01 between", value1, value2, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB103CC01 not between", value1, value2, "protb103cc01");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02IsNull() {
            addCriterion("PROTB103CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02IsNotNull() {
            addCriterion("PROTB103CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02EqualTo(Date value) {
            addCriterion("PROTB103CC02 =", value, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02NotEqualTo(Date value) {
            addCriterion("PROTB103CC02 <>", value, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02GreaterThan(Date value) {
            addCriterion("PROTB103CC02 >", value, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB103CC02 >=", value, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02LessThan(Date value) {
            addCriterion("PROTB103CC02 <", value, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB103CC02 <=", value, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02In(List<Date> values) {
            addCriterion("PROTB103CC02 in", values, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02NotIn(List<Date> values) {
            addCriterion("PROTB103CC02 not in", values, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02Between(Date value1, Date value2) {
            addCriterion("PROTB103CC02 between", value1, value2, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB103CC02 not between", value1, value2, "protb103cc02");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03IsNull() {
            addCriterion("PROTB103CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03IsNotNull() {
            addCriterion("PROTB103CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03EqualTo(String value) {
            addCriterion("PROTB103CC03 =", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03NotEqualTo(String value) {
            addCriterion("PROTB103CC03 <>", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03GreaterThan(String value) {
            addCriterion("PROTB103CC03 >", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB103CC03 >=", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03LessThan(String value) {
            addCriterion("PROTB103CC03 <", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB103CC03 <=", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03Like(String value) {
            addCriterion("PROTB103CC03 like", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03NotLike(String value) {
            addCriterion("PROTB103CC03 not like", value, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03In(List<String> values) {
            addCriterion("PROTB103CC03 in", values, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03NotIn(List<String> values) {
            addCriterion("PROTB103CC03 not in", values, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03Between(String value1, String value2) {
            addCriterion("PROTB103CC03 between", value1, value2, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB103CC03 not between", value1, value2, "protb103cc03");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00IsNull() {
            addCriterion("PROTB103CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00IsNotNull() {
            addCriterion("PROTB103CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00EqualTo(String value) {
            addCriterion("PROTB103CD00 =", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00NotEqualTo(String value) {
            addCriterion("PROTB103CD00 <>", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00GreaterThan(String value) {
            addCriterion("PROTB103CD00 >", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB103CD00 >=", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00LessThan(String value) {
            addCriterion("PROTB103CD00 <", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB103CD00 <=", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00Like(String value) {
            addCriterion("PROTB103CD00 like", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00NotLike(String value) {
            addCriterion("PROTB103CD00 not like", value, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00In(List<String> values) {
            addCriterion("PROTB103CD00 in", values, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00NotIn(List<String> values) {
            addCriterion("PROTB103CD00 not in", values, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00Between(String value1, String value2) {
            addCriterion("PROTB103CD00 between", value1, value2, "protb103cd00");
            return (Criteria) this;
        }

        public Criteria andProtb103cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB103CD00 not between", value1, value2, "protb103cd00");
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