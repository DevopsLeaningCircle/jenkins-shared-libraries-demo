// Creates a custom step called 'Greeting' you can call inside pipelines
def call(String name = 'World') {
    echo "Hello, ${name}! Welcome to Jenkins Shared Library."
}