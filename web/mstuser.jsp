<%-- 
    Document   : mstuser
    Created on : Jan 29, 2017, 11:53:13 PM
    Author     : cigist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"></jsp:include> 
    <script src="jscontroller/MstUserController.js"></script>
    <div class="col-md-9 container-fluid" ng-app="myApp">
        <div class="panel panel-default">
            <div class="panel-heading">Data Master User</div>
            <div class="container-fluid">
                <div class="panel-body">
                    <div class="container-fluid" ng-controller="myCtrl">  
                        <div class="form-group row">
                            <div class="col-sm-2">
                                <button class="btn btn-primary" data-toggle="modal" data-target="#myAdd"><span class="glyphicon glyphicon glyphicon-plus"></span> New Data</button>
                            </div>
                            <div class="col-sm-10">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Search" name="userby" ng-model="userby">
                                    <div class="input-group-btn">
                                        <a class="btn btn-warning" type="button" ng-click="getUserBy()" >
                                            <i class="glyphicon glyphicon-search"></i>
                                            Track
                                        </a>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="table-wrapper" ng-submit="getUserDetails()">
                            <table class="table table-bordered table-hover table-responsive">
                                <thead>
                                    <tr style="background-color:#4289cc;color: #fff;">
                                        <th>User Code</th>
                                        <th style="width: 260px;">Username</th>
                                        <th  style="width:350px;">Name</th>
                                        <th>Active</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr ng-repeat="p in person">
                                        <td>{{p.cdUser}}</td>
                                        <td>{{p.username}}</td>
                                        <td>{{p.name}}</td>
                                        <td>{{p.flagActive}}</td>                                  
                                        <td>
                                            <a href="MstUserServlet?action=delete&userId=<c:out value="${user.userid}"/>" type="button" class="btn btn-danger">
                                            <span class="glyphicon glyphicon glyphicon-trash"></span></a>
                                        <a class="btn btn-success" data-toggle="modal" data-target="#myAdd" ng-click="selectEdit(id)"><span class="glyphicon glyphicon glyphicon-pencil"></span></a>

                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <ul class="pagination">
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                    </ul>

                </div>

            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="myAdd" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header" style="background-color:#4289cc ;color: white;">
                <button type="button" class="close btn-success" data-dismiss="modal" style="color:#fff;">&times;</button>
                <h4 class="modal-title">Master User</h4>
            </div>
            <div class="modal-body">
                <div class="container-fluid">

                    <form class="form-horizontal" ng-controller="myCtrl" action="MstUserServlet" method="POST">
                        <div class="form-group">
                            <label class="control-label col-sm-3" >User Code:</label>
                            <div class="col-sm-5">
                                <input type="text" class="form-control" id="userId" name="userId" ng-model="userform.userId" placeholder="User Code"  value="<c:out value="${user.userid}" />" required="" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="email">Email/Username:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="username" name="username" ng-model="userform.username" placeholder="Enter email/username" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="pwd">Password:</label>
                            <div class="col-sm-8"> 
                                <input type="password" class="form-control" id="password" name="password" ng-model="userform.password" placeholder="Enter password" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="pwd">Repassword:</label>
                            <div class="col-sm-8"> 
                                <input type="password" class="form-control" id="repassword" name="repassword" placeholder="Enter Repassword" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="name">Your Name:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="name" name="name" ng-model="userform.name" placeholder="Enter Your Name" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sel1" class="control-label col-sm-3">Flag Active:</label>
                            <div class="col-sm-8">
                                <select class="form-control" id="flagActive" ng-model="userform.flagActive" name="flagActive">
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group"> 
                            <div class="col-sm-offset-3 col-sm-8">
                                <div class="checkbox">
                                    <label><input type="checkbox" required=""> I agree</label>
                                </div>
                            </div>
                        </div>

                        <div class="form-group"> 
                            <div class="col-sm-offset-3 col-sm-8">
                                <button type="submit" class="btn btn-primary" id="save" >Save</button>
                                <button  class="btn btn-primary" id="cancel" data-dismiss="modal">Cancel</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>

    </div>
</div>


