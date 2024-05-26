
# DIY Home Improvement Project Tracker API

## Introduction
The DIY Home Improvement Project Tracker API enables users to manage and track their home improvement projects. Users can create new projects, view the status of ongoing projects, update project details, and close completed projects.

## Base URL
`http://localhost:8080/api

## Endpoints

### 1. Create a New Project Report

**HTTP Method:** `POST`

**Endpoint:** `/projects`

**Description:** Allows users to start new projects with  name description .

**Request Headers:**
- `Content-Type: application/json`

**Request Body:**
```json
{

"user"  :  {
"userId":  "1",
"name":  "Marko",
"surname":  "Ivanovski",
"password":  "12345678",
"email":  "marko.ivanovski@gmail.com"
},
"projectName":  "decking",
"projectDesc":  "making a deck for my house",
"startDate":  "2024-06-15T12:00:00Z",
"endDate":  "2024-07-15T12:00:00Z",
"userId":  "1"
} 
```

**Responses:**

- **201 Created:**
  ```json
		  {
  "projectId":  8,
  "user":  {
  "userId":  1,
	"name":  "Marko",
	"surname":  "Ivanovski",
	"password":  "12345678",
	"email":  "marko.ivanovski@gmail.com"
	},
	"projectName":  "decking",
	"projectDesc":  "making a deck for my house",
	"startDate":  "2024-06-15T12:00:00.000+00:00",
	"endDate":  "2024-07-15T12:00:00.000+00:00"
	}
  ```
---

### 2. View Current Status of Reported Projects

**HTTP Method:** `GET`

**Endpoint:** `/projects`

**Description:** View the current status of all reported projects.

**Request Headers:**
- `http://localhost:8080/api/projects

**Responses:**

- **200 OK:**
  ```json
	  [
	{
	"projectId":  5,
	"user":  null,
	"projectName":  "decking",
	"projectDesc":  "making a deck for my house",
	"startDate":  "2024-06-15T12:00:00.000+00:00",
	"endDate":  "2024-07-15T12:00:00.000+00:00"
	},
	{
	"projectId":  8,
	"user":  {
	"userId":  1,
	"name":  "Marko",
	"surname":  "Ivanovski",
	"password":  "12345678",
	"email":  "marko.ivanovski@gmail.com"
	},
	"projectName":  "decking",
	"projectDesc":  "making a deck for my house",
	"startDate":  "2024-06-15T12:00:00.000+00:00",
	"endDate":  "2024-07-15T12:00:00.000+00:00"
	}
	]
  ```
- **204 No Content:** No projects found

---

### 3. Retrieve a Single Project Report

**HTTP Method:** `GET`

**Endpoint:** `/projects/{projectId}`

**Description:** Retrieve details of a single project report by its ID.

**Request Headers:**
- `Accept: http://localhost:8080/api/projects/8`

**Path Parameters:**
- `id` (integer): ID of the project

**Responses:**

- **200 OK:**
  ```json
  {
	"projectId":  8,
	"user":  {
	"userId":  1,
	"name":  "Marko",
	"surname":  "Ivanovski",
	"password":  "12345678",
	"email":  "marko.ivanovski@gmail.com"
	},
	"projectName":  "decking",
	"projectDesc":  "making a deck for my house",
	"startDate":  "2024-06-15T12:00:00.000+00:00",
	"endDate":  "2024-07-15T12:00:00.000+00:00"
	}
  ```
- **404 Not Found:** Project not found

---

### 4. Update Project Status

**HTTP Method:** `PUT`

**Endpoint:** `/projects/{projectId}`

**Description:** Update the status of a project, including steps taken or resolution details.

**Request Headers:**
- `Content-Type: application/json`

**Path Parameters:**
- `id` (integer): ID of the project

**Request Body:**
```json
{
  "status": "Completed",
}
```

**Responses:**

- **200 OK:**
  ```json
	  {
	   {
	"projectId":  8,
	"user":  {
	"userId":  1,
	"name":  "Marko",
	"surname":  "Ivanovski",
	"password":  "12345678",
	"email":  "marko.ivanovski@gmail.com"
	},
	"status":  "Completed",
	"projectName":  "decking",
	"projectDesc":  "making a deck for my house",
	"startDate":  "2024-06-15T12:00:00.000+00:00",
	"endDate":  "2024-07-15T12:00:00.000+00:00"
	}
  ```
- **400 Bad Request:** Invalid input
- **404 Not Found:** Project not found

---

### 5. Close a Project Report

**HTTP Method:** `DELETE`

**Endpoint:** `/projects/{projectId}`

**Description:** Close a project report once resolved, retaining historical data for analysis.

**Request Headers:**
- `Accept: application/json`

**Path Parameters:**
- `id` (integer): ID of the project

**Responses:**

- **204 No Content:** Successfully closed
- **404 Not Found:** Project not found
