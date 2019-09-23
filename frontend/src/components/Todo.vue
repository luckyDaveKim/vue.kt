<template>
  <section id="todo">
    <header class="header">
      <h1>할 일 리스트</h1>
      <b-form-group
              label="할 일:"
              label-for="new-todo"
              description="오늘할 일을 내일로 미루지 말자!!!">
        <b-form-input
                v-model="newTodo"
                class="new-todo"
                autofocus autocomplete="off"
                placeholder="할 일을 생각해 보자..."
                @keyup.enter="addTodo">
        </b-form-input>
      </b-form-group>
    </header>

    <section class="main" v-show="todos.length" v-cloak>
      <b-list-group class="todo-list">
        <b-list-group-item v-for="todo in todos"
                           :key="todo.id"
                           class="todo"
                           button
                           @click="removeTodo(todo)">
          {{ todo.title }}
        </b-list-group-item>
      </b-list-group>
    </section>
  </section>
</template>

<script>
	import {BFormGroup, BFormInput, BListGroup, BListGroupItem} from 'bootstrap-vue'

	import 'bootstrap/dist/css/bootstrap.css'
	import 'bootstrap-vue/dist/bootstrap-vue.css'

	/* localStorage */
	const STORAGE_KEY = 'todos-vue.kt'
	const todoStorage = {
		fetch: function () {
			const todos = JSON.parse(localStorage.getItem(STORAGE_KEY) || '[]')
			todos.forEach(function (todo, index) {
				todo.id = index
			})
			todoStorage.uid = todos.length
			return todos
		},
		save: function (todos) {
			localStorage.setItem(STORAGE_KEY, JSON.stringify(todos))
		}
	}

	export default {
		components: {
			BFormGroup, BFormInput,
			BListGroup, BListGroupItem
		},
		data: function () {
			return {
				todos: todoStorage.fetch(),
				newTodo: '',
			}
		},

		watch: {
			todos: {
				handler: function (todos) {
					todoStorage.save(todos)
				},
				deep: true
			}
		},

		methods: {
			addTodo: function () {
				const newTodo = this.newTodo && this.newTodo.trim()
				if (!newTodo) {
					return
				}
				this.todos.push({
					id: todoStorage.uid++,
					title: newTodo,
					completed: false
				})
				this.newTodo = ''
			},

			removeTodo: function (todo) {
				this.todos.splice(this.todos.indexOf(todo), 1)
			}
		}
	}
</script>

<style>
  .todo-list .todo:hover {
    color: #d9d9d9;
    text-decoration: line-through;
  }
</style>
